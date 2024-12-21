import tkinter as tk
from tkinter import ttk
from PIL import Image, ImageTk
from event_manager import handle_input  


class ChatApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Chat App")
        self.root.geometry("600x700")
        self.root.resizable(True, True)  

        # Default Theme
        self.bg_color = "#f0f0f0"
        self.text_color = "#000000"

        # Configure grid layout
        self.root.columnconfigure(0, weight=1)
        self.root.rowconfigure(0, weight=1)

        # Setting up the main frame
        self.main_frame = ttk.Frame(root, padding=10)
        self.main_frame.grid(row=0, column=0, sticky="nsew")
        self.main_frame.columnconfigure(0, weight=1)
        self.main_frame.rowconfigure(0, weight=1)

        # Scrollable chat display
        self.chat_display = tk.Text(
            self.main_frame,
            wrap=tk.WORD,
            state="disabled",
            bg=self.bg_color,
            fg=self.text_color,
            font=("Arial", 12),
        )
        self.chat_display.grid(row=0, column=0, columnspan=2, sticky="nsew", padx=5, pady=5)

        # Inout field and send button
        self.input_frame = ttk.Frame(self.main_frame)
        self.input_frame.grid(row=1, column=0, columnspan=2, sticky="ew", pady=10)
        self.input_frame.columnconfigure(0, weight=1)

        self.input_field = ttk.Entry(self.input_frame, font=("Arial", 12))
        self.input_field.grid(row=0, column=0, sticky="ew", padx=5)

        self.send_button = ttk.Button(self.input_frame, text="Send", command=self.handle_message)
        self.send_button.grid(row=0, column=1, padx=5)

        # Event binding for "Enter" key
        self.input_field.bind("<Return>", lambda event: self.handle_message())

    def display_message(self, text, sender="user"):
        """Display a message in the chat window."""
        self.chat_display.config(state="normal")

        # Create chat bubble
        bubble_frame = ttk.Frame(self.chat_display, padding=10)
        bubble_frame.pack(anchor=tk.E, pady=5)

        # Add image
        if sender == "user":
            image_path = "images/user.jpg"
        else:
            image_path = "images/chatbot.jpg"

        img = Image.open(image_path)
        img = img.resize((40, 40), Image.LANCZOS)  
        photo = ImageTk.PhotoImage(img)

        avatar_label = ttk.Label(bubble_frame, image=photo)
        avatar_label.image = photo  
        avatar_label.pack(side=tk.LEFT, padx=5)

        # Add text bubble
        text_label = tk.Label(
            bubble_frame,
            text=text,
            wraplength=400,
            justify=tk.LEFT,
            bg="#d0e6f6",
            fg="#000000",
            font=("Arial", 12),
            padx=10,
            pady=5,
            relief=tk.RAISED,
        )
        text_label.pack(side=tk.LEFT if sender == "bot" else tk.RIGHT)

        # Insert chat bubble in the chat display
        self.chat_display.window_create(tk.END, window=bubble_frame)
        self.chat_display.insert(tk.END, "\n")
        self.chat_display.config(state="disabled")
        self.chat_display.see(tk.END)

    def handle_message(self):
        """Handle user input and generate bot response."""
        user_message = self.input_field.get().strip()
        if user_message:
            self.input_field.delete(0, tk.END)
            self.display_message(user_message, sender="user")  # Display user message
            bot_response = handle_input(user_message)  # Get bot response
            self.root.after(500, lambda: self.display_message(bot_response, sender="bot"))


if __name__ == "__main__":
    root = tk.Tk()
    app = ChatApp(root)
    root.mainloop()
