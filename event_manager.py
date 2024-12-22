from datetime import datetime
from rapidfuzz import process
from antlr4 import InputStream, CommonTokenStream
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
    "hi",
    "hello",
    "hey",
    "exit",
    
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
    def visitGreeting(self, ctx):
        """Respond to greetings."""
        return "Hello! How can I assist you today?"
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
        return """
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
        """

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
        
    # def visitPartialCreateCommand(self, ctx):
    #     """Handle partial detection of 'create' and its subcommands."""
    #     if ctx.partialCreate():
    #         create_text = ctx.partialCreate().getText()
            
    #         if create_text == "create":
    #             if ctx.afterCreate():
    #                 after_create_text = ctx.afterCreate().getText()
    #                 if after_create_text.startswith("task"):
    #                     return f"Partial input detected: 'create task' (in progress)"
    #                 elif after_create_text.startswith("event"):
    #                     return f"Partial input detected: 'create event' (in progress)"
    #             return f"Partial input detected: 'create' (continue typing)"
            
    #         return f"Partial input detected: '{create_text}' (continue typing)"
        
    #     return "No partial command detected."

    def visitPartialCreateCommand(self, ctx):
        """Handle partial detection of 'create' and 'show' commands and their subcommands."""
        
        # Check if partialCreate is matched
        if ctx.partialCreate():
            create_text = ctx.partialCreate().getText()

            if create_text == "create":
                if ctx.afterCreate():
                    after_create_text = ctx.afterCreate().getText()

                    # Handle task-related inputs after 'create'
                    if (after_create_text.startswith("t") or after_create_text.startswith("ta") or after_create_text.startswith("tas") or after_create_text.startswith("task")) and after_create_text != "tasks":
                        return "tasks"
                    
                    # Handle event-related inputs after 'create'
                    elif (after_create_text.startswith("e") or after_create_text.startswith("ev") or after_create_text.startswith("eve") or after_create_text.startswith("even")) and after_create_text != "event":
                        return "event"
                    
                    # Complete syntax for event or task
                    elif after_create_text == "event":
                        return "event syntax"
                    elif after_create_text == "tasks":
                        return "tasks syntax"
                return "create"
            
            return "before create"
        
        # Check for partialShow (now part of the same rule)
        if ctx.partialShow():
            show_text = ctx.partialShow().getText()

            if show_text == "show":
                if ctx.afterCreate():  # After "show", we expect either "event" or "tasks"
                    after_show_text = ctx.afterCreate().getText()

                    # Handle 'event' or 'tasks' after 'show'
                    if (after_show_text.startswith("e") or after_show_text.startswith("ev") or after_show_text.startswith("eve") or after_show_text.startswith("even")):
                        return "show event"
                    elif (after_show_text.startswith("t") or after_show_text.startswith("ta") or after_show_text.startswith("tas") or after_show_text.startswith("task")):
                        return "show tasks"
                return "show"
            return "before show"
    
        # Check for partialUpdate (now part of the same rule)
        if ctx.partialUpdate():
            update_text = ctx.partialUpdate().getText()

            if update_text == "update":
                if ctx.afterCreate():  # After "update", we expect "event" 
                    after_update_text = ctx.afterCreate().getText()

                    if (after_update_text.startswith("e") or after_update_text.startswith("ev") or after_update_text.startswith("eve") or after_update_text.startswith("even")) and after_update_text != "event":
                        return "update event"
                    elif after_update_text == "event":
                        return "update event syntax"
                return "update"
            return "before update"
        
    
        # Check for partialUpdate (now part of the same rule)
        if ctx.partialTimeTo():
            timeto_text = ctx.partialTimeTo().getText()

            if timeto_text == "time" + "to":
                if ctx.afterCreate():  # After "update", we expect "event" 
                    after_timeto_text = ctx.afterCreate().getText()

                    if (after_timeto_text.startswith("e") or after_timeto_text.startswith("ev") or after_timeto_text.startswith("eve") or after_timeto_text.startswith("even")) and after_timeto_text != "event":
                        return "timeto event"
                    elif after_timeto_text == "event":
                        return "timeto event syntax"
                return "timeto"
            return "before timeto"
        
        return "No partial command detected."




def handle_partial_input(user_input):
    """
    Handle partial input detection using the ANTLR parser.
    This function processes the input dynamically, parsing incremental letters
    to detect commands like 'create', followed by subcommands 'event' or 'task',
    or 'show', followed by 'event' or 'tasks', and now also 'update' and 'time to'.
    """
    try:
        # Initialize ANTLR for partial input processing
        input_stream = InputStream(user_input)
        lexer = ChatBotCommandLexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        parser = ChatBotCommandParser(token_stream)

        # Parse the partial command for both create, show, update, and time to
        tree = parser.partialCreateCommand()  # Specific rule for partial commands

        if tree:
            visitor = ChatBotCommandInterpreter()
            result = visitor.visit(tree)
            return result if result else "Partial command detected but incomplete. Keep typing!"

        return "No matching partial input detected."

    except Exception as e:
        # Handle exceptions during partial parsing
        return f"Error processing partial input: {str(e)}"




def handle_input(user_input):
    try:
        # Check for exit condition
        if user_input.lower() in {"exit", "quit"}:
            return "Exiting chatbot."

        # Fuzzy match the command
        matched_command = match_command(user_input)
        if matched_command is None:
            return "I'm sorry, I didn't understand that. Type 'help' for a list of commands."
        if matched_command in ["hi", "hello", "hey"]:
            return "Hello! How can I assist you today?"

        if not user_input.strip():
            return "Command is empty. Please enter a valid one\n Try help!"

        # Here we first ensure the command is complete using a validation step (to avoid leaks):
        if not is_full_command(user_input):
            return f"Did you mean {matched_command} ?. Type 'help' for more information."

        # Parse the full input to create a new tree
        input_stream = InputStream(user_input)  
        lexer = ChatBotCommandLexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        parser = ChatBotCommandParser(token_stream)

        # Parse the full command and visit the tree
        tree = parser.command()

        visitor = ChatBotCommandInterpreter()
        result = visitor.visit(tree)

        # If parsing is successful, return the result
        if result:
            return result
        else:
            return "Could not parse the command correctly. Please ensure the syntax is correct."

    except Exception as e:
        print(f"\n{str(e)}")
        return f"Error occurred. Please ensure the command is correct. Type 'help' for a list of commands."


def is_full_command(user_input):
    """Check if the user input corresponds to a complete command based on some validation logic."""
    user_input = user_input.strip().lower()

    # Check for 'create event' command: must have both event name (in quotes) and a date/time ('at')
    if user_input.startswith("create event"):
        if '"' in user_input and 'at' in user_input:
            return True
        return False  # If event name or date/time is missing, it's a partial command. 
    
    # The rest are similar
    if user_input.startswith("show event") or user_input.startswith("show tasks"):
        return True

    if user_input.startswith("update event"):
        if '"' in user_input and 'change time to' in user_input:
            return True
        return False 

    if user_input.startswith("create tasks for"):
        if '"' in user_input and ':' in user_input:
            return True
        return False  

    if user_input.startswith("time to event"):
        if '"' in user_input:
            return True
        return False  

    if user_input.startswith("help"):
        return True

    return False
