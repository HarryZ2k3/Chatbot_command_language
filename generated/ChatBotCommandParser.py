# Generated from c:/Users/trieu/Downloads/Chatbot_command_language-main/Chatbot_command_language-main/ChatBotCommand.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,42,197,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,1,0,1,0,1,0,1,0,1,0,1,0,
        1,0,1,0,1,0,3,0,46,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,3,1,
        3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,
        6,1,6,1,6,1,6,5,6,78,8,6,10,6,12,6,81,9,6,1,7,1,7,1,7,1,7,1,7,1,
        8,1,8,1,8,3,8,91,8,8,1,9,1,9,3,9,95,8,9,1,9,1,9,1,9,3,9,100,8,9,
        1,9,1,9,1,9,3,9,105,8,9,1,9,1,9,1,9,3,9,110,8,9,1,9,1,9,1,9,3,9,
        115,8,9,3,9,117,8,9,1,10,1,10,3,10,121,8,10,1,10,3,10,124,8,10,1,
        10,3,10,127,8,10,1,10,3,10,130,8,10,1,10,1,10,3,10,134,8,10,1,11,
        1,11,3,11,138,8,11,1,11,3,11,141,8,11,1,11,3,11,144,8,11,1,11,3,
        11,147,8,11,1,11,3,11,150,8,11,1,11,3,11,153,8,11,1,12,1,12,3,12,
        157,8,12,1,12,3,12,160,8,12,1,12,3,12,163,8,12,1,12,3,12,166,8,12,
        1,13,1,13,3,13,170,8,13,1,13,3,13,173,8,13,1,13,3,13,176,8,13,1,
        13,3,13,179,8,13,1,13,3,13,182,8,13,1,13,3,13,185,8,13,1,14,1,14,
        3,14,189,8,14,1,15,1,15,1,16,1,16,1,17,1,17,1,17,0,0,18,0,2,4,6,
        8,10,12,14,16,18,20,22,24,26,28,30,32,34,0,4,1,0,14,16,3,0,2,2,20,
        20,31,33,3,0,5,5,17,17,34,36,3,0,14,16,26,26,37,39,219,0,45,1,0,
        0,0,2,47,1,0,0,0,4,53,1,0,0,0,6,56,1,0,0,0,8,64,1,0,0,0,10,66,1,
        0,0,0,12,69,1,0,0,0,14,82,1,0,0,0,16,87,1,0,0,0,18,116,1,0,0,0,20,
        133,1,0,0,0,22,152,1,0,0,0,24,165,1,0,0,0,26,184,1,0,0,0,28,188,
        1,0,0,0,30,190,1,0,0,0,32,192,1,0,0,0,34,194,1,0,0,0,36,46,3,2,1,
        0,37,46,3,4,2,0,38,46,3,6,3,0,39,46,3,8,4,0,40,46,3,10,5,0,41,46,
        3,12,6,0,42,46,3,14,7,0,43,46,3,18,9,0,44,46,3,16,8,0,45,36,1,0,
        0,0,45,37,1,0,0,0,45,38,1,0,0,0,45,39,1,0,0,0,45,40,1,0,0,0,45,41,
        1,0,0,0,45,42,1,0,0,0,45,43,1,0,0,0,45,44,1,0,0,0,46,1,1,0,0,0,47,
        48,5,1,0,0,48,49,5,2,0,0,49,50,5,40,0,0,50,51,5,3,0,0,51,52,5,41,
        0,0,52,3,1,0,0,0,53,54,5,4,0,0,54,55,5,5,0,0,55,5,1,0,0,0,56,57,
        5,6,0,0,57,58,5,2,0,0,58,59,5,40,0,0,59,60,5,7,0,0,60,61,5,8,0,0,
        61,62,5,9,0,0,62,63,5,41,0,0,63,7,1,0,0,0,64,65,5,10,0,0,65,9,1,
        0,0,0,66,67,5,4,0,0,67,68,5,2,0,0,68,11,1,0,0,0,69,70,5,1,0,0,70,
        71,5,5,0,0,71,72,5,11,0,0,72,73,5,40,0,0,73,74,5,12,0,0,74,79,5,
        40,0,0,75,76,5,13,0,0,76,78,5,40,0,0,77,75,1,0,0,0,78,81,1,0,0,0,
        79,77,1,0,0,0,79,80,1,0,0,0,80,13,1,0,0,0,81,79,1,0,0,0,82,83,5,
        8,0,0,83,84,5,9,0,0,84,85,5,2,0,0,85,86,5,40,0,0,86,15,1,0,0,0,87,
        90,7,0,0,0,88,89,5,13,0,0,89,91,5,40,0,0,90,88,1,0,0,0,90,91,1,0,
        0,0,91,17,1,0,0,0,92,94,3,26,13,0,93,95,3,28,14,0,94,93,1,0,0,0,
        94,95,1,0,0,0,95,117,1,0,0,0,96,97,3,24,12,0,97,98,3,28,14,0,98,
        100,1,0,0,0,99,96,1,0,0,0,99,100,1,0,0,0,100,117,1,0,0,0,101,102,
        3,22,11,0,102,103,3,28,14,0,103,105,1,0,0,0,104,101,1,0,0,0,104,
        105,1,0,0,0,105,117,1,0,0,0,106,107,3,20,10,0,107,108,3,28,14,0,
        108,110,1,0,0,0,109,106,1,0,0,0,109,110,1,0,0,0,110,117,1,0,0,0,
        111,112,3,34,17,0,112,113,3,28,14,0,113,115,1,0,0,0,114,111,1,0,
        0,0,114,115,1,0,0,0,115,117,1,0,0,0,116,92,1,0,0,0,116,99,1,0,0,
        0,116,104,1,0,0,0,116,109,1,0,0,0,116,114,1,0,0,0,117,19,1,0,0,0,
        118,120,5,17,0,0,119,121,5,18,0,0,120,119,1,0,0,0,120,121,1,0,0,
        0,121,123,1,0,0,0,122,124,5,19,0,0,123,122,1,0,0,0,123,124,1,0,0,
        0,124,126,1,0,0,0,125,127,5,20,0,0,126,125,1,0,0,0,126,127,1,0,0,
        0,127,129,1,0,0,0,128,130,5,9,0,0,129,128,1,0,0,0,129,130,1,0,0,
        0,130,134,1,0,0,0,131,132,5,8,0,0,132,134,5,9,0,0,133,118,1,0,0,
        0,133,131,1,0,0,0,134,21,1,0,0,0,135,137,5,21,0,0,136,138,5,22,0,
        0,137,136,1,0,0,0,137,138,1,0,0,0,138,140,1,0,0,0,139,141,5,23,0,
        0,140,139,1,0,0,0,140,141,1,0,0,0,141,143,1,0,0,0,142,144,5,24,0,
        0,143,142,1,0,0,0,143,144,1,0,0,0,144,146,1,0,0,0,145,147,5,17,0,
        0,146,145,1,0,0,0,146,147,1,0,0,0,147,149,1,0,0,0,148,150,5,20,0,
        0,149,148,1,0,0,0,149,150,1,0,0,0,150,153,1,0,0,0,151,153,5,6,0,
        0,152,135,1,0,0,0,152,151,1,0,0,0,153,23,1,0,0,0,154,156,5,25,0,
        0,155,157,5,26,0,0,156,155,1,0,0,0,156,157,1,0,0,0,157,159,1,0,0,
        0,158,160,5,27,0,0,159,158,1,0,0,0,159,160,1,0,0,0,160,162,1,0,0,
        0,161,163,5,28,0,0,162,161,1,0,0,0,162,163,1,0,0,0,163,166,1,0,0,
        0,164,166,5,4,0,0,165,154,1,0,0,0,165,164,1,0,0,0,166,25,1,0,0,0,
        167,169,5,29,0,0,168,170,5,30,0,0,169,168,1,0,0,0,169,170,1,0,0,
        0,170,172,1,0,0,0,171,173,5,20,0,0,172,171,1,0,0,0,172,173,1,0,0,
        0,173,175,1,0,0,0,174,176,5,24,0,0,175,174,1,0,0,0,175,176,1,0,0,
        0,176,178,1,0,0,0,177,179,5,17,0,0,178,177,1,0,0,0,178,179,1,0,0,
        0,179,181,1,0,0,0,180,182,5,20,0,0,181,180,1,0,0,0,181,182,1,0,0,
        0,182,185,1,0,0,0,183,185,5,1,0,0,184,167,1,0,0,0,184,183,1,0,0,
        0,185,27,1,0,0,0,186,189,3,32,16,0,187,189,3,30,15,0,188,186,1,0,
        0,0,188,187,1,0,0,0,189,29,1,0,0,0,190,191,7,1,0,0,191,31,1,0,0,
        0,192,193,7,2,0,0,193,33,1,0,0,0,194,195,7,3,0,0,195,35,1,0,0,0,
        31,45,79,90,94,99,104,109,114,116,120,123,126,129,133,137,140,143,
        146,149,152,156,159,162,165,169,172,175,178,181,184,188
    ]

class ChatBotCommandParser ( Parser ):

    grammarFileName = "ChatBotCommand.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'create'", "'event'", "'at'", "'show'", 
                     "'tasks'", "'update'", "'change'", "'time'", "'to'", 
                     "'help'", "'for'", "':'", "','", "'hi'", "'hello'", 
                     "'hey'", "'t'", "'i'", "'m'", "'e'", "'u'", "'p'", 
                     "'d'", "'a'", "'s'", "'h'", "'o'", "'w'", "'c'", "'r'", 
                     "'ev'", "'eve'", "'even'", "'ta'", "'tas'", "'task'", 
                     "'he'", "'hel'", "'hell'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "STRING", "DATETIME", "WS" ]

    RULE_command = 0
    RULE_createEvent = 1
    RULE_showTasks = 2
    RULE_updateEvent = 3
    RULE_helpCommand = 4
    RULE_showEvent = 5
    RULE_createTasks = 6
    RULE_timeToEvent = 7
    RULE_greetingCommand = 8
    RULE_partialCreateCommand = 9
    RULE_partialTimeTo = 10
    RULE_partialUpdate = 11
    RULE_partialShow = 12
    RULE_partialCreate = 13
    RULE_afterCreate = 14
    RULE_partialEvent = 15
    RULE_partialTask = 16
    RULE_partialGreeting = 17

    ruleNames =  [ "command", "createEvent", "showTasks", "updateEvent", 
                   "helpCommand", "showEvent", "createTasks", "timeToEvent", 
                   "greetingCommand", "partialCreateCommand", "partialTimeTo", 
                   "partialUpdate", "partialShow", "partialCreate", "afterCreate", 
                   "partialEvent", "partialTask", "partialGreeting" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    T__27=28
    T__28=29
    T__29=30
    T__30=31
    T__31=32
    T__32=33
    T__33=34
    T__34=35
    T__35=36
    T__36=37
    T__37=38
    T__38=39
    STRING=40
    DATETIME=41
    WS=42

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class CommandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def createEvent(self):
            return self.getTypedRuleContext(ChatBotCommandParser.CreateEventContext,0)


        def showTasks(self):
            return self.getTypedRuleContext(ChatBotCommandParser.ShowTasksContext,0)


        def updateEvent(self):
            return self.getTypedRuleContext(ChatBotCommandParser.UpdateEventContext,0)


        def helpCommand(self):
            return self.getTypedRuleContext(ChatBotCommandParser.HelpCommandContext,0)


        def showEvent(self):
            return self.getTypedRuleContext(ChatBotCommandParser.ShowEventContext,0)


        def createTasks(self):
            return self.getTypedRuleContext(ChatBotCommandParser.CreateTasksContext,0)


        def timeToEvent(self):
            return self.getTypedRuleContext(ChatBotCommandParser.TimeToEventContext,0)


        def partialCreateCommand(self):
            return self.getTypedRuleContext(ChatBotCommandParser.PartialCreateCommandContext,0)


        def greetingCommand(self):
            return self.getTypedRuleContext(ChatBotCommandParser.GreetingCommandContext,0)


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_command

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCommand" ):
                return visitor.visitCommand(self)
            else:
                return visitor.visitChildren(self)




    def command(self):

        localctx = ChatBotCommandParser.CommandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_command)
        try:
            self.state = 45
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 36
                self.createEvent()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 37
                self.showTasks()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 38
                self.updateEvent()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 39
                self.helpCommand()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 40
                self.showEvent()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 41
                self.createTasks()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 42
                self.timeToEvent()
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 43
                self.partialCreateCommand()
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 44
                self.greetingCommand()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CreateEventContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(ChatBotCommandParser.STRING, 0)

        def DATETIME(self):
            return self.getToken(ChatBotCommandParser.DATETIME, 0)

        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_createEvent

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCreateEvent" ):
                return visitor.visitCreateEvent(self)
            else:
                return visitor.visitChildren(self)




    def createEvent(self):

        localctx = ChatBotCommandParser.CreateEventContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_createEvent)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
            self.match(ChatBotCommandParser.T__0)
            self.state = 48
            self.match(ChatBotCommandParser.T__1)
            self.state = 49
            self.match(ChatBotCommandParser.STRING)
            self.state = 50
            self.match(ChatBotCommandParser.T__2)
            self.state = 51
            self.match(ChatBotCommandParser.DATETIME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ShowTasksContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_showTasks

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitShowTasks" ):
                return visitor.visitShowTasks(self)
            else:
                return visitor.visitChildren(self)




    def showTasks(self):

        localctx = ChatBotCommandParser.ShowTasksContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_showTasks)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.match(ChatBotCommandParser.T__3)
            self.state = 54
            self.match(ChatBotCommandParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class UpdateEventContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(ChatBotCommandParser.STRING, 0)

        def DATETIME(self):
            return self.getToken(ChatBotCommandParser.DATETIME, 0)

        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_updateEvent

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUpdateEvent" ):
                return visitor.visitUpdateEvent(self)
            else:
                return visitor.visitChildren(self)




    def updateEvent(self):

        localctx = ChatBotCommandParser.UpdateEventContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_updateEvent)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 56
            self.match(ChatBotCommandParser.T__5)
            self.state = 57
            self.match(ChatBotCommandParser.T__1)
            self.state = 58
            self.match(ChatBotCommandParser.STRING)
            self.state = 59
            self.match(ChatBotCommandParser.T__6)
            self.state = 60
            self.match(ChatBotCommandParser.T__7)
            self.state = 61
            self.match(ChatBotCommandParser.T__8)
            self.state = 62
            self.match(ChatBotCommandParser.DATETIME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class HelpCommandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_helpCommand

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitHelpCommand" ):
                return visitor.visitHelpCommand(self)
            else:
                return visitor.visitChildren(self)




    def helpCommand(self):

        localctx = ChatBotCommandParser.HelpCommandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_helpCommand)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.match(ChatBotCommandParser.T__9)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ShowEventContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_showEvent

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitShowEvent" ):
                return visitor.visitShowEvent(self)
            else:
                return visitor.visitChildren(self)




    def showEvent(self):

        localctx = ChatBotCommandParser.ShowEventContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_showEvent)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(ChatBotCommandParser.T__3)
            self.state = 67
            self.match(ChatBotCommandParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CreateTasksContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self, i:int=None):
            if i is None:
                return self.getTokens(ChatBotCommandParser.STRING)
            else:
                return self.getToken(ChatBotCommandParser.STRING, i)

        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_createTasks

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCreateTasks" ):
                return visitor.visitCreateTasks(self)
            else:
                return visitor.visitChildren(self)




    def createTasks(self):

        localctx = ChatBotCommandParser.CreateTasksContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_createTasks)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 69
            self.match(ChatBotCommandParser.T__0)
            self.state = 70
            self.match(ChatBotCommandParser.T__4)
            self.state = 71
            self.match(ChatBotCommandParser.T__10)
            self.state = 72
            self.match(ChatBotCommandParser.STRING)
            self.state = 73
            self.match(ChatBotCommandParser.T__11)
            self.state = 74
            self.match(ChatBotCommandParser.STRING)
            self.state = 79
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==13:
                self.state = 75
                self.match(ChatBotCommandParser.T__12)
                self.state = 76
                self.match(ChatBotCommandParser.STRING)
                self.state = 81
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TimeToEventContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(ChatBotCommandParser.STRING, 0)

        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_timeToEvent

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTimeToEvent" ):
                return visitor.visitTimeToEvent(self)
            else:
                return visitor.visitChildren(self)




    def timeToEvent(self):

        localctx = ChatBotCommandParser.TimeToEventContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_timeToEvent)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 82
            self.match(ChatBotCommandParser.T__7)
            self.state = 83
            self.match(ChatBotCommandParser.T__8)
            self.state = 84
            self.match(ChatBotCommandParser.T__1)
            self.state = 85
            self.match(ChatBotCommandParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class GreetingCommandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_greetingCommand

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class GreetingContext(GreetingCommandContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ChatBotCommandParser.GreetingCommandContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(ChatBotCommandParser.STRING, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGreeting" ):
                return visitor.visitGreeting(self)
            else:
                return visitor.visitChildren(self)



    def greetingCommand(self):

        localctx = ChatBotCommandParser.GreetingCommandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_greetingCommand)
        self._la = 0 # Token type
        try:
            localctx = ChatBotCommandParser.GreetingContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 87
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 114688) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 90
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==13:
                self.state = 88
                self.match(ChatBotCommandParser.T__12)
                self.state = 89
                self.match(ChatBotCommandParser.STRING)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PartialCreateCommandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def partialCreate(self):
            return self.getTypedRuleContext(ChatBotCommandParser.PartialCreateContext,0)


        def afterCreate(self):
            return self.getTypedRuleContext(ChatBotCommandParser.AfterCreateContext,0)


        def partialShow(self):
            return self.getTypedRuleContext(ChatBotCommandParser.PartialShowContext,0)


        def partialUpdate(self):
            return self.getTypedRuleContext(ChatBotCommandParser.PartialUpdateContext,0)


        def partialTimeTo(self):
            return self.getTypedRuleContext(ChatBotCommandParser.PartialTimeToContext,0)


        def partialGreeting(self):
            return self.getTypedRuleContext(ChatBotCommandParser.PartialGreetingContext,0)


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_partialCreateCommand

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPartialCreateCommand" ):
                return visitor.visitPartialCreateCommand(self)
            else:
                return visitor.visitChildren(self)




    def partialCreateCommand(self):

        localctx = ChatBotCommandParser.PartialCreateCommandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_partialCreateCommand)
        self._la = 0 # Token type
        try:
            self.state = 116
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 92
                self.partialCreate()
                self.state = 94
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & 135292649508) != 0):
                    self.state = 93
                    self.afterCreate()


                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 99
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==4 or _la==25:
                    self.state = 96
                    self.partialShow()
                    self.state = 97
                    self.afterCreate()


                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 104
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==6 or _la==21:
                    self.state = 101
                    self.partialUpdate()
                    self.state = 102
                    self.afterCreate()


                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 109
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==8 or _la==17:
                    self.state = 106
                    self.partialTimeTo()
                    self.state = 107
                    self.afterCreate()


                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 114
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & 962139897856) != 0):
                    self.state = 111
                    self.partialGreeting()
                    self.state = 112
                    self.afterCreate()


                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PartialTimeToContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_partialTimeTo

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPartialTimeTo" ):
                return visitor.visitPartialTimeTo(self)
            else:
                return visitor.visitChildren(self)




    def partialTimeTo(self):

        localctx = ChatBotCommandParser.PartialTimeToContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_partialTimeTo)
        self._la = 0 # Token type
        try:
            self.state = 133
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [17]:
                self.enterOuterAlt(localctx, 1)
                self.state = 118
                self.match(ChatBotCommandParser.T__16)

                self.state = 120
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==18:
                    self.state = 119
                    self.match(ChatBotCommandParser.T__17)


                self.state = 123
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==19:
                    self.state = 122
                    self.match(ChatBotCommandParser.T__18)


                self.state = 126
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,11,self._ctx)
                if la_ == 1:
                    self.state = 125
                    self.match(ChatBotCommandParser.T__19)


                self.state = 129
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==9:
                    self.state = 128
                    self.match(ChatBotCommandParser.T__8)


                pass
            elif token in [8]:
                self.enterOuterAlt(localctx, 2)
                self.state = 131
                self.match(ChatBotCommandParser.T__7)
                self.state = 132
                self.match(ChatBotCommandParser.T__8)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PartialUpdateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_partialUpdate

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPartialUpdate" ):
                return visitor.visitPartialUpdate(self)
            else:
                return visitor.visitChildren(self)




    def partialUpdate(self):

        localctx = ChatBotCommandParser.PartialUpdateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_partialUpdate)
        self._la = 0 # Token type
        try:
            self.state = 152
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [21]:
                self.enterOuterAlt(localctx, 1)
                self.state = 135
                self.match(ChatBotCommandParser.T__20)

                self.state = 137
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==22:
                    self.state = 136
                    self.match(ChatBotCommandParser.T__21)


                self.state = 140
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==23:
                    self.state = 139
                    self.match(ChatBotCommandParser.T__22)


                self.state = 143
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==24:
                    self.state = 142
                    self.match(ChatBotCommandParser.T__23)


                self.state = 146
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
                if la_ == 1:
                    self.state = 145
                    self.match(ChatBotCommandParser.T__16)


                self.state = 149
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,18,self._ctx)
                if la_ == 1:
                    self.state = 148
                    self.match(ChatBotCommandParser.T__19)


                pass
            elif token in [6]:
                self.enterOuterAlt(localctx, 2)
                self.state = 151
                self.match(ChatBotCommandParser.T__5)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PartialShowContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_partialShow

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPartialShow" ):
                return visitor.visitPartialShow(self)
            else:
                return visitor.visitChildren(self)




    def partialShow(self):

        localctx = ChatBotCommandParser.PartialShowContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_partialShow)
        self._la = 0 # Token type
        try:
            self.state = 165
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [25]:
                self.enterOuterAlt(localctx, 1)
                self.state = 154
                self.match(ChatBotCommandParser.T__24)

                self.state = 156
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==26:
                    self.state = 155
                    self.match(ChatBotCommandParser.T__25)


                self.state = 159
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==27:
                    self.state = 158
                    self.match(ChatBotCommandParser.T__26)


                self.state = 162
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==28:
                    self.state = 161
                    self.match(ChatBotCommandParser.T__27)


                pass
            elif token in [4]:
                self.enterOuterAlt(localctx, 2)
                self.state = 164
                self.match(ChatBotCommandParser.T__3)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PartialCreateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_partialCreate

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPartialCreate" ):
                return visitor.visitPartialCreate(self)
            else:
                return visitor.visitChildren(self)




    def partialCreate(self):

        localctx = ChatBotCommandParser.PartialCreateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_partialCreate)
        self._la = 0 # Token type
        try:
            self.state = 184
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [29]:
                self.enterOuterAlt(localctx, 1)
                self.state = 167
                self.match(ChatBotCommandParser.T__28)

                self.state = 169
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==30:
                    self.state = 168
                    self.match(ChatBotCommandParser.T__29)


                self.state = 172
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,25,self._ctx)
                if la_ == 1:
                    self.state = 171
                    self.match(ChatBotCommandParser.T__19)


                self.state = 175
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==24:
                    self.state = 174
                    self.match(ChatBotCommandParser.T__23)


                self.state = 178
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,27,self._ctx)
                if la_ == 1:
                    self.state = 177
                    self.match(ChatBotCommandParser.T__16)


                self.state = 181
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,28,self._ctx)
                if la_ == 1:
                    self.state = 180
                    self.match(ChatBotCommandParser.T__19)


                pass
            elif token in [1]:
                self.enterOuterAlt(localctx, 2)
                self.state = 183
                self.match(ChatBotCommandParser.T__0)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AfterCreateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def partialTask(self):
            return self.getTypedRuleContext(ChatBotCommandParser.PartialTaskContext,0)


        def partialEvent(self):
            return self.getTypedRuleContext(ChatBotCommandParser.PartialEventContext,0)


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_afterCreate

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAfterCreate" ):
                return visitor.visitAfterCreate(self)
            else:
                return visitor.visitChildren(self)




    def afterCreate(self):

        localctx = ChatBotCommandParser.AfterCreateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_afterCreate)
        try:
            self.state = 188
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5, 17, 34, 35, 36]:
                self.enterOuterAlt(localctx, 1)
                self.state = 186
                self.partialTask()
                pass
            elif token in [2, 20, 31, 32, 33]:
                self.enterOuterAlt(localctx, 2)
                self.state = 187
                self.partialEvent()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PartialEventContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_partialEvent

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPartialEvent" ):
                return visitor.visitPartialEvent(self)
            else:
                return visitor.visitChildren(self)




    def partialEvent(self):

        localctx = ChatBotCommandParser.PartialEventContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_partialEvent)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 190
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 15033434116) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PartialTaskContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_partialTask

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPartialTask" ):
                return visitor.visitPartialTask(self)
            else:
                return visitor.visitChildren(self)




    def partialTask(self):

        localctx = ChatBotCommandParser.PartialTaskContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_partialTask)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 192
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 120259215392) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PartialGreetingContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ChatBotCommandParser.RULE_partialGreeting

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPartialGreeting" ):
                return visitor.visitPartialGreeting(self)
            else:
                return visitor.visitChildren(self)




    def partialGreeting(self):

        localctx = ChatBotCommandParser.PartialGreetingContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_partialGreeting)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 194
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 962139897856) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





