# Generated from ChatBotCommand.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ChatBotCommandParser import ChatBotCommandParser
else:
    from ChatBotCommandParser import ChatBotCommandParser

# This class defines a complete listener for a parse tree produced by ChatBotCommandParser.
class ChatBotCommandListener(ParseTreeListener):

    # Enter a parse tree produced by ChatBotCommandParser#command.
    def enterCommand(self, ctx:ChatBotCommandParser.CommandContext):
        pass

    # Exit a parse tree produced by ChatBotCommandParser#command.
    def exitCommand(self, ctx:ChatBotCommandParser.CommandContext):
        pass


    # Enter a parse tree produced by ChatBotCommandParser#createEvent.
    def enterCreateEvent(self, ctx:ChatBotCommandParser.CreateEventContext):
        pass

    # Exit a parse tree produced by ChatBotCommandParser#createEvent.
    def exitCreateEvent(self, ctx:ChatBotCommandParser.CreateEventContext):
        pass


    # Enter a parse tree produced by ChatBotCommandParser#showTasks.
    def enterShowTasks(self, ctx:ChatBotCommandParser.ShowTasksContext):
        pass

    # Exit a parse tree produced by ChatBotCommandParser#showTasks.
    def exitShowTasks(self, ctx:ChatBotCommandParser.ShowTasksContext):
        pass


    # Enter a parse tree produced by ChatBotCommandParser#updateEvent.
    def enterUpdateEvent(self, ctx:ChatBotCommandParser.UpdateEventContext):
        pass

    # Exit a parse tree produced by ChatBotCommandParser#updateEvent.
    def exitUpdateEvent(self, ctx:ChatBotCommandParser.UpdateEventContext):
        pass


    # Enter a parse tree produced by ChatBotCommandParser#helpCommand.
    def enterHelpCommand(self, ctx:ChatBotCommandParser.HelpCommandContext):
        pass

    # Exit a parse tree produced by ChatBotCommandParser#helpCommand.
    def exitHelpCommand(self, ctx:ChatBotCommandParser.HelpCommandContext):
        pass


    # Enter a parse tree produced by ChatBotCommandParser#showEvent.
    def enterShowEvent(self, ctx:ChatBotCommandParser.ShowEventContext):
        pass

    # Exit a parse tree produced by ChatBotCommandParser#showEvent.
    def exitShowEvent(self, ctx:ChatBotCommandParser.ShowEventContext):
        pass


    # Enter a parse tree produced by ChatBotCommandParser#createTasks.
    def enterCreateTasks(self, ctx:ChatBotCommandParser.CreateTasksContext):
        pass

    # Exit a parse tree produced by ChatBotCommandParser#createTasks.
    def exitCreateTasks(self, ctx:ChatBotCommandParser.CreateTasksContext):
        pass


    # Enter a parse tree produced by ChatBotCommandParser#timeToEvent.
    def enterTimeToEvent(self, ctx:ChatBotCommandParser.TimeToEventContext):
        pass

    # Exit a parse tree produced by ChatBotCommandParser#timeToEvent.
    def exitTimeToEvent(self, ctx:ChatBotCommandParser.TimeToEventContext):
        pass



del ChatBotCommandParser