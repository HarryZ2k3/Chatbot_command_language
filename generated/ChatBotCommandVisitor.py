# Generated from ChatBotCommand.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ChatBotCommandParser import ChatBotCommandParser
else:
    from ChatBotCommandParser import ChatBotCommandParser

# This class defines a complete generic visitor for a parse tree produced by ChatBotCommandParser.

class ChatBotCommandVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ChatBotCommandParser#command.
    def visitCommand(self, ctx:ChatBotCommandParser.CommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ChatBotCommandParser#createEvent.
    def visitCreateEvent(self, ctx:ChatBotCommandParser.CreateEventContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ChatBotCommandParser#showTasks.
    def visitShowTasks(self, ctx:ChatBotCommandParser.ShowTasksContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ChatBotCommandParser#updateEvent.
    def visitUpdateEvent(self, ctx:ChatBotCommandParser.UpdateEventContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ChatBotCommandParser#helpCommand.
    def visitHelpCommand(self, ctx:ChatBotCommandParser.HelpCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ChatBotCommandParser#showEvent.
    def visitShowEvent(self, ctx:ChatBotCommandParser.ShowEventContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ChatBotCommandParser#createTasks.
    def visitCreateTasks(self, ctx:ChatBotCommandParser.CreateTasksContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ChatBotCommandParser#timeToEvent.
    def visitTimeToEvent(self, ctx:ChatBotCommandParser.TimeToEventContext):
        return self.visitChildren(ctx)



del ChatBotCommandParser