import sys
from antlr4 import *
from generated.ChatBotCommandLexer import ChatBotCommandLexer
from generated.ChatBotCommandParser import ChatBotCommandParser
from generated.ChatBotCommandVisitor import ChatBotCommandVisitor

# Global storage for events and tasks
events = {}

# Visitor implementation
class ChatBotCommandInterpreter(ChatBotCommandVisitor):
    def visitCreateEvent(self, ctx):
        event_name = ctx.STRING().getText().strip('"')
        datetime = ctx.DATETIME().getText()
        if event_name in events:
            return f"Event '{event_name}' already exists!"
        events[event_name] = {'datetime': datetime, 'tasks': []}
        return f"Created event: '{event_name}' at {datetime}"

    def visitShowTasks(self, ctx):
        tasks_output = []
        for event, data in events.items():
            if data['tasks']:
                tasks_output.append(f"{event}: {', '.join(data['tasks'])}")
        return "Tasks for events:\n" + "\n".join(tasks_output) if tasks_output else "No tasks found."

    def visitUpdateEvent(self, ctx):
        event_name = ctx.STRING().getText().strip('"')
        datetime = ctx.DATETIME().getText()
        if event_name not in events:
            return f"Event '{event_name}' does not exist!"
        events[event_name]['datetime'] = datetime
        return f"Updated event: '{event_name}' to new time {datetime}"

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

6. Help:
   Syntax: help

7. Exit:
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

            # ANTLR processing
            input_stream = InputStream(user_input)
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
            print("Invalid command! Type 'help' to see the list of available commands.")

if __name__ == "__main__":
    main()
