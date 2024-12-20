import sys
from antlr4 import *
from datetime import datetime
from rapidfuzz import process
from generated.ChatBotCommandLexer import ChatBotCommandLexer
from generated.ChatBotCommandParser import ChatBotCommandParser
from generated.ChatBotCommandVisitor import ChatBotCommandVisitor

# Global storage for events and tasks
events = {}

# List of valid commands for fuzzy matching
COMMANDS = [
    "create event",
    "show tasks",
    "update event",
    "help",
    "show event",
    "create tasks",
    "time to event",
    "exit"
]

# Function to match user input with the closest command
def match_command(user_input):
    # Match the initial part of the command to predefined commands
    possible_command = " ".join(user_input.split()[:2])  # Match the first 2 words
    best_match = process.extractOne(possible_command, COMMANDS, score_cutoff=70)
    if best_match:
        return best_match[0]  # Return the closest command
    return None

# Visitor implementation
class ChatBotCommandInterpreter(ChatBotCommandVisitor):
    def visitCreateEvent(self, ctx):
        event_name = ctx.STRING().getText().strip('"')
        datetime_str = ctx.DATETIME().getText()
        if event_name in events:
            return f"Event '{event_name}' already exists!"
        events[event_name] = {'datetime': datetime_str, 'tasks': []}
        return f"Created event: '{event_name}' at {datetime_str}"

    def visitShowTasks(self, ctx):
        tasks_output = []
        for event, data in events.items():
            if data['tasks']:
                tasks_output.append(f"{event}: {', '.join(data['tasks'])}")
        return "Tasks for events:\n" + "\n".join(tasks_output) if tasks_output else "No tasks found."

    def visitUpdateEvent(self, ctx):
        event_name = ctx.STRING().getText().strip('"')
        datetime_str = ctx.DATETIME().getText()
        if event_name not in events:
            return f"Event '{event_name}' does not exist!"
        events[event_name]['datetime'] = datetime_str
        return f"Updated event: '{event_name}' to new time {datetime_str}"

    def visitHelpCommand(self, ctx):
        print("""
Available commands:
1. Create an event:
   Syntax: create event "<event_name>" at <YYYY-MM-DD HH:MM>
   Example: create event "Team Meeting" at 2024-11-20 10:00

2. Show all events:
   Syntax: show event

3. Show all tasks:
   Syntax: show tasks

4. Update an event:
   Syntax: update event "<event_name>" change time to <YYYY-MM-DD HH:MM>

5. Create tasks for an event:
   Syntax: create tasks for "<event_name>": "<task1>", "<task2>", ...
   Example: create tasks for "Team Meeting": "Prepare slides", "Send invites"

6. Time to an event:
   Syntax: time to event "<event_name>"
   Example: time to event "Team Meeting"

7. Help:
   Syntax: help

8. Exit:
   Syntax: exit or quit
        """)
        return None

    def visitShowEvent(self, ctx):
        if not events:
            return "No events found."
        return "\n".join([f"{name}: {data['datetime']}" for name, data in events.items()])

    def visitCreateTasks(self, ctx):
        event_name = ctx.STRING(0).getText().strip('"')
        if event_name not in events:
            return f"Event '{event_name}' does not exist!"
        tasks = [ctx.STRING(i).getText().strip('"') for i in range(1, len(ctx.STRING()))]
        events[event_name]['tasks'].extend(tasks)
        return f"Added tasks to event '{event_name}': {', '.join(tasks)}"

    def visitTimeToEvent(self, ctx):
        event_name = ctx.STRING().getText().strip('"')
        if event_name not in events:
            return f"Event '{event_name}' does not exist!"
        event_datetime_str = events[event_name]['datetime']
        event_datetime = datetime.strptime(event_datetime_str, "%Y-%m-%d %H:%M")
        current_datetime = datetime.now()
        time_difference = event_datetime - current_datetime
        if time_difference.total_seconds() < 0:
            return f"Event '{event_name}' has already occurred."
        days, seconds = divmod(time_difference.total_seconds(), 86400)
        hours, seconds = divmod(seconds, 3600)
        minutes = seconds // 60
        return f"Time to '{event_name}': {int(days)} days, {int(hours)} hours, {int(minutes)} minutes."

# Main function
def main():
    while True:
        try:
            # Input command from user
            user_input = input("Enter command: ")

            # Exit condition
            if user_input.lower() in {"exit", "quit"}:
                print("Exiting chatbot.")
                break

            # Fuzzy match the command
            matched_command = match_command(user_input)
            if matched_command is None:
                print("Invalid command! Type 'help' to see the list of available commands.")
                continue

            print(f"Interpreted command: {matched_command}")
            input_stream = InputStream(user_input)  # FIX! Passing input in here
            lexer = ChatBotCommandLexer(input_stream)
            token_stream = CommonTokenStream(lexer)
            parser = ChatBotCommandParser(token_stream)

            # Parse the command and visit the tree
            tree = parser.command()
            visitor = ChatBotCommandInterpreter()
            result = visitor.visit(tree)

            # Only print the result if it's not None
            if result is not None:
                print(result)

        except Exception as e:
            print(f"Error occurred! Type 'help' to see the list of available commands.\n{str(e)}")

if __name__ == "__main__":
    main()
