import sys
import tkinter as tk
from tkinter import ttk
from PIL import Image, ImageTk
from event_manager import handle_input, handle_partial_input
import os
import subprocess

class ChatApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Chat App")
        self.root.geometry("600x700")
        self.root.resizable(True, True)

        # Default Theme
        self.bg_color = "#f0f0f0"
        self.text_color = "#000000"

        # Array to track input letters
        self.input_letters = []

        # Configure grid layout
        self.root.columnconfigure(0, weight=1)
        self.root.rowconfigure(0, weight=1)

        # Setting up the main frame
        self.main_frame = ttk.Frame(root, padding=10)
        self.main_frame.grid(row=0, column=0, sticky="nsew")
        self.main_frame.columnconfigure(0, weight=1)
        self.main_frame.rowconfigure(0, weight=1)

        # Scrollbar for chat display
        self.scrollbar = tk.Scrollbar(self.main_frame, orient=tk.VERTICAL)

        # Scrollable chat display
        self.chat_display = tk.Text(
            self.main_frame,
            wrap=tk.WORD,
            state="disabled",
            bg=self.bg_color,
            fg=self.text_color,
            font=("Arial", 12),
            yscrollcommand=self.scrollbar.set,  # Attach the scrollbar
        )
        self.chat_display.grid(row=0, column=0, sticky="nsew", padx=5, pady=5)

        # Configure the scrollbar
        self.scrollbar.config(command=self.chat_display.yview)
        self.scrollbar.grid(row=0, column=1, sticky="ns")

        # Input field and send button
        self.input_frame = ttk.Frame(self.main_frame)
        self.input_frame.grid(row=1, column=0, columnspan=2, sticky="ew", pady=10)
        self.input_frame.columnconfigure(0, weight=1)

        # Bind StringVar to input field
        self.input_var = tk.StringVar()
        self.input_var.trace_add("write", self.on_input_change)

        self.input_field = ttk.Entry(self.input_frame, font=("Arial", 12), textvariable=self.input_var)
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

        try:
            img = Image.open(image_path)
        except FileNotFoundError:
            img = Image.new("RGB", (40, 40), color="gray")  # Placeholder image
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
            if bot_response == "Exiting chatbot.":  # Check for the exit condition
                self.root.quit()  # Quit the application
            self.root.after(500, lambda: self.display_message(bot_response, sender="bot"))

    def on_input_change(self, *_):
        """Callback function for real-time input change detection."""
        current_text = self.input_var.get()
        new_letters = list(current_text)
        
        if new_letters != self.input_letters:
            self.input_letters = new_letters
            print("Detecting letters:", self.input_letters)

            # Process the partial input through the parser
            partial_result = handle_partial_input(current_text)
            print("Partial input processing result:", partial_result)

            # Determine the flag from the partial result
            flag = partial_result  

            # Handle the flag and show the popup suggestion accordingly
            self.show_suggestion(flag)

    def show_suggestion(self, flag):
        """Show the appropriate suggestion above the input field based on the flag."""
        # Check if the suggestion frame already exists
        if hasattr(self, 'suggestion_frame') and self.suggestion_frame.winfo_exists():
            self.suggestion_frame.destroy()

        # Create a new frame for the popup suggestion
        self.suggestion_frame = ttk.Frame(self.main_frame, padding=5, relief=tk.RAISED, style="TFrame")
        self.suggestion_frame.grid(row=2, column=0, columnspan=2, sticky="ew", pady=5)

        # Define messages based on the flag
        suggestion_text = ""
        if flag == "before create":
            suggestion_text = "create"
        elif flag == "create":
            suggestion_text = "'event' or 'tasks'"
        elif flag == "tasks":
            suggestion_text = "tasks"
        elif flag == "event":
            suggestion_text = "event"
        elif flag == "event syntax":
            suggestion_text = '"<event_name>" at <YYYY-MM-DD HH:MM>'
        elif flag == "tasks syntax":
            suggestion_text = 'for "<event_name>": "<task1>", "<task2>", ...'

            # Additional handling for the partial show input commands
        elif flag == "before show":
            suggestion_text = "show"
        elif flag == "show":
            suggestion_text = "'event' or 'tasks'"
        elif flag == "show event":
            suggestion_text = "event"
        elif flag == "show tasks":
            suggestion_text = "tasks"

            # Additional handling for the partial update input commands
        elif flag == "before update":
            suggestion_text = "update"
        elif flag == "update":
            suggestion_text = "event"
        elif flag == "update event":
            suggestion_text = "event"
        elif flag == "update event syntax":
            suggestion_text = '"<event_name>" change time to <YYYY-MM-DD HH:MM>'

            # Additional handling for the partial update input commands
        elif flag == "before timeto":
            suggestion_text = "time"
        elif flag == "timeto":
            suggestion_text = "event"
        elif flag == "timeto event":
            suggestion_text = "event"
        elif flag == "timeto event syntax":
            suggestion_text = '"<event_name>"'
        else:
            suggestion_text = ""


        # Display the suggestion
        suggestion_label = ttk.Label(self.suggestion_frame, text=suggestion_text, font=("Arial", 12), background="#f0f0f0", foreground="#000000")
        suggestion_label.pack(fill=tk.X)

        self.root.update_idletasks()  # Ensure layout is updated immediately



def regenerate_antlr_files():
    """Regenerate ANTLR files using the grammar definition."""
    # Define your variables
    DIR = os.path.dirname(__file__)  
    ANTLR_JAR = os.path.join(DIR, 'antlr-4.13.2-complete.jar')  # Relative path to the ANTLR jar inside the project
    CPL_Dest = os.path.join(DIR, 'generated')  
    SRC = os.path.join(DIR, 'ChatBotCommand.g4')  

    # Ensure that the source grammar file and ANTLR jar file exist
    if not os.path.exists(SRC):
        print(f"Error: Grammar file '{SRC}' not found.")
    elif not os.path.exists(ANTLR_JAR):
        print(f"Error: ANTLR jar file '{ANTLR_JAR}' not found.")
    else:
        try:
            subprocess.run(
                ['java', '-jar', ANTLR_JAR, '-o', CPL_Dest, '-no-listener', '-visitor', '-Dlanguage=Python3', SRC],
                check=True
            )
            print("ANTLR files generated successfully.")
        except subprocess.CalledProcessError as e:
            print(f"Error occurred during ANTLR generation: {e}")
        except FileNotFoundError as e:
            print(f"File not found: {e}")



if __name__ == "__main__":
    regenerate_antlr_files()  
    root = tk.Tk()
    app = ChatApp(root)
    root.mainloop()
