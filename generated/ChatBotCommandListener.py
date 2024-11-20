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


    # Enter a parse tree produced by ChatBotCommandParser#createEventCommand.
    def enterCreateEventCommand(self, ctx:ChatBotCommandParser.CreateEventCommandContext):
        pass

    # Exit a parse tree produced by ChatBotCommandParser#createEventCommand.
    def exitCreateEventCommand(self, ctx:ChatBotCommandParser.CreateEventCommandContext):
        pass


    # Enter a parse tree produced by ChatBotCommandParser#showTasksCommand.
    def enterShowTasksCommand(self, ctx:ChatBotCommandParser.ShowTasksCommandContext):
        pass

    # Exit a parse tree produced by ChatBotCommandParser#showTasksCommand.
    def exitShowTasksCommand(self, ctx:ChatBotCommandParser.ShowTasksCommandContext):
        pass


    # Enter a parse tree produced by ChatBotCommandParser#updateEventCommand.
    def enterUpdateEventCommand(self, ctx:ChatBotCommandParser.UpdateEventCommandContext):
        pass

    # Exit a parse tree produced by ChatBotCommandParser#updateEventCommand.
    def exitUpdateEventCommand(self, ctx:ChatBotCommandParser.UpdateEventCommandContext):
        pass


    # Enter a parse tree produced by ChatBotCommandParser#helpCommand.
    def enterHelpCommand(self, ctx:ChatBotCommandParser.HelpCommandContext):
        pass

    # Exit a parse tree produced by ChatBotCommandParser#helpCommand.
    def exitHelpCommand(self, ctx:ChatBotCommandParser.HelpCommandContext):
        pass



del ChatBotCommandParser