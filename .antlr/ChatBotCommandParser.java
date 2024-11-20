// Generated from g:/WORK/CODE/Chatbot_command_language/ChatBotCommand.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ChatBotCommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		QUOTEDSTRING=10, DATETIME=11, WS=12;
	public static final int
		RULE_command = 0, RULE_createEventCommand = 1, RULE_showTasksCommand = 2, 
		RULE_updateEventCommand = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"command", "createEventCommand", "showTasksCommand", "updateEventCommand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'event'", "'at'", "'show'", "'tasks'", "'update'", 
			"'change'", "'time'", "'to'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "QUOTEDSTRING", 
			"DATETIME", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ChatBotCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChatBotCommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public CreateEventCommandContext createEventCommand() {
			return getRuleContext(CreateEventCommandContext.class,0);
		}
		public ShowTasksCommandContext showTasksCommand() {
			return getRuleContext(ShowTasksCommandContext.class,0);
		}
		public UpdateEventCommandContext updateEventCommand() {
			return getRuleContext(UpdateEventCommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotCommandListener ) ((ChatBotCommandListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotCommandListener ) ((ChatBotCommandListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(11);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				createEventCommand();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				showTasksCommand();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(10);
				updateEventCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateEventCommandContext extends ParserRuleContext {
		public TerminalNode QUOTEDSTRING() { return getToken(ChatBotCommandParser.QUOTEDSTRING, 0); }
		public TerminalNode DATETIME() { return getToken(ChatBotCommandParser.DATETIME, 0); }
		public CreateEventCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createEventCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotCommandListener ) ((ChatBotCommandListener)listener).enterCreateEventCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotCommandListener ) ((ChatBotCommandListener)listener).exitCreateEventCommand(this);
		}
	}

	public final CreateEventCommandContext createEventCommand() throws RecognitionException {
		CreateEventCommandContext _localctx = new CreateEventCommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createEventCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(T__0);
			setState(14);
			match(T__1);
			setState(15);
			match(QUOTEDSTRING);
			setState(16);
			match(T__2);
			setState(17);
			match(DATETIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShowTasksCommandContext extends ParserRuleContext {
		public ShowTasksCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTasksCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotCommandListener ) ((ChatBotCommandListener)listener).enterShowTasksCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotCommandListener ) ((ChatBotCommandListener)listener).exitShowTasksCommand(this);
		}
	}

	public final ShowTasksCommandContext showTasksCommand() throws RecognitionException {
		ShowTasksCommandContext _localctx = new ShowTasksCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_showTasksCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__3);
			setState(20);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateEventCommandContext extends ParserRuleContext {
		public TerminalNode QUOTEDSTRING() { return getToken(ChatBotCommandParser.QUOTEDSTRING, 0); }
		public TerminalNode DATETIME() { return getToken(ChatBotCommandParser.DATETIME, 0); }
		public UpdateEventCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateEventCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotCommandListener ) ((ChatBotCommandListener)listener).enterUpdateEventCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotCommandListener ) ((ChatBotCommandListener)listener).exitUpdateEventCommand(this);
		}
	}

	public final UpdateEventCommandContext updateEventCommand() throws RecognitionException {
		UpdateEventCommandContext _localctx = new UpdateEventCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_updateEventCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__5);
			setState(23);
			match(T__1);
			setState(24);
			match(QUOTEDSTRING);
			setState(25);
			match(T__6);
			setState(26);
			match(T__7);
			setState(27);
			match(T__8);
			setState(28);
			match(DATETIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\f\u001f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\f\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006"+
		"\u0000\u0000\u001c\u0000\u000b\u0001\u0000\u0000\u0000\u0002\r\u0001\u0000"+
		"\u0000\u0000\u0004\u0013\u0001\u0000\u0000\u0000\u0006\u0016\u0001\u0000"+
		"\u0000\u0000\b\f\u0003\u0002\u0001\u0000\t\f\u0003\u0004\u0002\u0000\n"+
		"\f\u0003\u0006\u0003\u0000\u000b\b\u0001\u0000\u0000\u0000\u000b\t\u0001"+
		"\u0000\u0000\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u0001\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0005\u0001\u0000\u0000\u000e\u000f\u0005\u0002\u0000"+
		"\u0000\u000f\u0010\u0005\n\u0000\u0000\u0010\u0011\u0005\u0003\u0000\u0000"+
		"\u0011\u0012\u0005\u000b\u0000\u0000\u0012\u0003\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0005\u0004\u0000\u0000\u0014\u0015\u0005\u0005\u0000\u0000"+
		"\u0015\u0005\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0006\u0000\u0000"+
		"\u0017\u0018\u0005\u0002\u0000\u0000\u0018\u0019\u0005\n\u0000\u0000\u0019"+
		"\u001a\u0005\u0007\u0000\u0000\u001a\u001b\u0005\b\u0000\u0000\u001b\u001c"+
		"\u0005\t\u0000\u0000\u001c\u001d\u0005\u000b\u0000\u0000\u001d\u0007\u0001"+
		"\u0000\u0000\u0000\u0001\u000b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}