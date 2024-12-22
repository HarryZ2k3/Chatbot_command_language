---

# ChatBot Command Language

A powerful and extensible text-based chatbot built using [ANTLR](https://www.antlr.org/) for natural language parsing and Python for implementation. This chatbot supports creating and managing events, tasks, and interacting with users through greetings, time calculations, and fuzzy command matching.

---

## Features

- **Event Management**:
  - Create events with specific names and dates.
  - Update existing events with new dates and times.
  - Show all saved events.

- **Task Management**:
  - Add tasks to specific events.
  - Show all tasks grouped by events.

- **Time Calculations**:
  - Calculate and display the time remaining until a specific event.

- **Greeting System**:
  - Responds to user greetings like "hi", "hello", and "hey".
  - Supports partial or misspelled commands (e.g., "h", "hell", "he").

- **Fuzzy Matching**:
  - Handles typos and partial user inputs using fuzzy matching.
  - Suggests the closest match for unclear commands.

- **Help Command**:
  - Displays all available commands with usage examples.

---

## Getting Started

### Prerequisites

1. **Python 3.9+**
2. **ANTLR 4.13.2** (for generating the lexer and parser)
3. **Required Python Libraries**:
   - `antlr4-python3-runtime`
   - `rapidfuzz`
   - `pillow`

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/chatbot-command-language.git
   cd chatbot-command-language
   ```

2. Install the dependencies:
   ```bash
   pip install -r requirements.txt
   ```

3. Ensure ANTLR is installed and accessible:
   - Download ANTLR from [here](https://www.antlr.org/download.html).
   - Add it to your system's `PATH`.

4. Generate the lexer and parser:
   ```bash
   java -jar antlr-4.13.2-complete.jar -Dlanguage=Python3 ChatBotCommand.g4 -o generated
   ```

---

## Usage

1. Run the chatbot:
   ```bash
   python run.py
   ```

2. Interact with the chatbot using these commands:

### Supported Commands

| Command                               | Description                                                                                              | Example Input                                                                                   |
|---------------------------------------|----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|
| `create event "<name>" at <datetime>` | Creates an event with a specified name and datetime.                                                     | `create event "Team Meeting" at 2024-11-20 10:00`                                              |
| `update event "<name>" change time to <datetime>` | Updates the datetime of an existing event.                                                               | `update event "Team Meeting" change time to 2024-11-21 14:00`                                   |
| `show event`                          | Displays all saved events with their datetime.                                                           | `show event`                                                                                   |
| `create tasks for "<event>": "<task1>", "<task2>", ...` | Adds tasks to a specific event.                                                                          | `create tasks for "Team Meeting": "Prepare slides", "Send invites"`                            |
| `show tasks`                          | Displays all tasks grouped by their respective events.                                                   | `show tasks`                                                                                   |
| `time to event "<name>"`              | Calculates the remaining time until the specified event.                                                 | `time to event "Team Meeting"`                                                                 |
| `hi` / `hello` / `hey`                | Greets the chatbot and receives a greeting back.                                                         | `hi`                                                                                           |
| `help`                                | Displays all available commands with examples.                                                           | `help`                                                                                         |
| `exit`                                | Exits the chatbot.                                                                                       | `exit`                                                                                         |

### Handling Typos and Partial Commands

- **Typos**: The chatbot automatically corrects misspelled commands:
  - Input: `cret event "hi" at 2024-11-10 15:00`
  - Output: Interpreted as `create event "hi" at 2024-11-10 15:00`.

- **Partial Commands**: Recognizes incomplete greetings:
  - Input: `he`
  - Output: "Hello! How can I assist you today?"

---

## Project Structure

```plaintext
├── run.py                    # Main entry point for running the chatbot
├── event_manager.py          # Core logic for handling commands and fuzzy matching
├── ChatBotCommand.g4         # ANTLR grammar file for defining the chatbot's command language
├── requirements.txt          # Python dependencies
├── generated/                # Generated lexer and parser files
└── README.md                 # Documentation for the chatbot
```

---

## Contributing

1. Fork the repository.
2. Create a new branch for your feature:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes and push:
   ```bash
   git commit -m "Add your message"
   git push origin feature-name
   ```
4. Submit a pull request.

---

## License

This project is licensed under the [MIT License](LICENSE).

---

## Authors

- **Huynh Phuong Dai** - [GitHub](https://github.com/HarryZ2k3)
- **Nguyen Trieu Vy** - [GitHub](https://github.com/XCLBR75)
- **Pham Thai Quoc** - [GitHub](https://github.com/tquoc0112)

---
