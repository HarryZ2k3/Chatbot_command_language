import sys
from antlr4 import *
from generated.ChatBotCommandLexer import ChatBotCommandLexer
from generated.ChatBotCommandParser import ChatBotCommandParser


# Custom visitor to interpret the commands
class ChatBotCommandVisitor(ParseTreeVisitor):
    def visitCreateEvent(self, ctx):
        event_name = ctx.STRING().getText().strip('"')
        datetime = ctx.DATETIME().getText()
        return f"Creating event: '{event_name}' at {datetime}"

    def visitShowTasks(self, ctx):
        return "Displaying all tasks."

    def visitUpdateEvent(self, ctx):
        event_name = ctx.STRING().getText().strip('"')
        datetime = ctx.DATETIME().getText()
        return f"Updating event: '{event_name}' to new time {datetime}"
    def visitHelpCommand(self, ctx):
        print("""
Available commands:
1. Create an event:
   Syntax: create event "<event_name>" at <YYYY-MM-DD HH:MM>
   Example: create event "Team Meeting" at 2024-11-20 10:00

2. Show all tasks:
   Syntax: show tasks

3. Update an event:
   Syntax: update event "<event_name>" change time to <YYYY-MM-DD HH:MM>
   Example: update event "Team Meeting" change time to 2024-11-20 14:00

4. Help:
   Syntax: help

5. Exit:
   Syntax: exit or quit
        """)


def main():
    # Read user input
    while True:
        user_input = input("Enter command: ")
        if user_input.lower() in {"exit", "quit"}:
            print("Exiting chatbot.")
            break

        try:
            # Create the lexer and parser
            input_stream = InputStream(user_input)
            lexer = ChatBotCommandLexer(input_stream)
            token_stream = CommonTokenStream(lexer)
            parser = ChatBotCommandParser(token_stream)

            # Parse the command
            tree = parser.command()

            # Visit the parsed command
            visitor = ChatBotCommandVisitor()
            result = visitor.visit(tree)
            print(result)
        except Exception as e:
            print(f"Error: {e}")


if __name__ == "__main__":
    main()
