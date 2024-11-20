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
		T__9=10, T__10=11, STRING=12, DATETIME=13, COLON=14, COMMA=15, WS=16;
	public static final int
		RULE_command = 0, RULE_createEvent = 1, RULE_showTasks = 2, RULE_updateEvent = 3, 
		RULE_helpCommand = 4, RULE_showEvent = 5, RULE_createTasks = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"command", "createEvent", "showTasks", "updateEvent", "helpCommand", 
			"showEvent", "createTasks"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'event'", "'at'", "'show'", "'tasks'", "'update'", 
			"'change'", "'time'", "'to'", "'help'", "'for'", null, null, "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"STRING", "DATETIME", "COLON", "COMMA", "WS"
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
		public CreateEventContext createEvent() {
			return getRuleContext(CreateEventContext.class,0);
		}
		public ShowTasksContext showTasks() {
			return getRuleContext(ShowTasksContext.class,0);
		}
		public UpdateEventContext updateEvent() {
			return getRuleContext(UpdateEventContext.class,0);
		}
		public HelpCommandContext helpCommand() {
			return getRuleContext(HelpCommandContext.class,0);
		}
		public ShowEventContext showEvent() {
			return getRuleContext(ShowEventContext.class,0);
		}
		public CreateTasksContext createTasks() {
			return getRuleContext(CreateTasksContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				createEvent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				showTasks();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				updateEvent();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(17);
				helpCommand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(18);
				showEvent();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(19);
				createTasks();
				}
				break;
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
	public static class CreateEventContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ChatBotCommandParser.STRING, 0); }
		public TerminalNode DATETIME() { return getToken(ChatBotCommandParser.DATETIME, 0); }
		public CreateEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createEvent; }
	}

	public final CreateEventContext createEvent() throws RecognitionException {
		CreateEventContext _localctx = new CreateEventContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			match(T__1);
			setState(24);
			match(STRING);
			setState(25);
			match(T__2);
			setState(26);
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
	public static class ShowTasksContext extends ParserRuleContext {
		public ShowTasksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTasks; }
	}

	public final ShowTasksContext showTasks() throws RecognitionException {
		ShowTasksContext _localctx = new ShowTasksContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_showTasks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__3);
			setState(29);
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
	public static class UpdateEventContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ChatBotCommandParser.STRING, 0); }
		public TerminalNode DATETIME() { return getToken(ChatBotCommandParser.DATETIME, 0); }
		public UpdateEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateEvent; }
	}

	public final UpdateEventContext updateEvent() throws RecognitionException {
		UpdateEventContext _localctx = new UpdateEventContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_updateEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__5);
			setState(32);
			match(T__1);
			setState(33);
			match(STRING);
			setState(34);
			match(T__6);
			setState(35);
			match(T__7);
			setState(36);
			match(T__8);
			setState(37);
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
	public static class HelpCommandContext extends ParserRuleContext {
		public HelpCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helpCommand; }
	}

	public final HelpCommandContext helpCommand() throws RecognitionException {
		HelpCommandContext _localctx = new HelpCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_helpCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__9);
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
	public static class ShowEventContext extends ParserRuleContext {
		public ShowEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showEvent; }
	}

	public final ShowEventContext showEvent() throws RecognitionException {
		ShowEventContext _localctx = new ShowEventContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_showEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__3);
			setState(42);
			match(T__1);
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
	public static class CreateTasksContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(ChatBotCommandParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ChatBotCommandParser.STRING, i);
		}
		public TerminalNode COLON() { return getToken(ChatBotCommandParser.COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ChatBotCommandParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ChatBotCommandParser.COMMA, i);
		}
		public CreateTasksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTasks; }
	}

	public final CreateTasksContext createTasks() throws RecognitionException {
		CreateTasksContext _localctx = new CreateTasksContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createTasks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			match(T__4);
			setState(46);
			match(T__10);
			setState(47);
			match(STRING);
			setState(48);
			match(COLON);
			setState(49);
			match(STRING);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(50);
				match(COMMA);
				setState(51);
				match(STRING);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		"\u0004\u0001\u0010:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u00065\b\u0006\n\u0006\f\u00068\t\u0006\u0001\u0006\u0000\u0000\u0007"+
		"\u0000\u0002\u0004\u0006\b\n\f\u0000\u00008\u0000\u0014\u0001\u0000\u0000"+
		"\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004\u001c\u0001\u0000\u0000"+
		"\u0000\u0006\u001f\u0001\u0000\u0000\u0000\b\'\u0001\u0000\u0000\u0000"+
		"\n)\u0001\u0000\u0000\u0000\f,\u0001\u0000\u0000\u0000\u000e\u0015\u0003"+
		"\u0002\u0001\u0000\u000f\u0015\u0003\u0004\u0002\u0000\u0010\u0015\u0003"+
		"\u0006\u0003\u0000\u0011\u0015\u0003\b\u0004\u0000\u0012\u0015\u0003\n"+
		"\u0005\u0000\u0013\u0015\u0003\f\u0006\u0000\u0014\u000e\u0001\u0000\u0000"+
		"\u0000\u0014\u000f\u0001\u0000\u0000\u0000\u0014\u0010\u0001\u0000\u0000"+
		"\u0000\u0014\u0011\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000"+
		"\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0001\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005\u0002\u0000"+
		"\u0000\u0018\u0019\u0005\f\u0000\u0000\u0019\u001a\u0005\u0003\u0000\u0000"+
		"\u001a\u001b\u0005\r\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0005\u0004\u0000\u0000\u001d\u001e\u0005\u0005\u0000\u0000\u001e"+
		"\u0005\u0001\u0000\u0000\u0000\u001f \u0005\u0006\u0000\u0000 !\u0005"+
		"\u0002\u0000\u0000!\"\u0005\f\u0000\u0000\"#\u0005\u0007\u0000\u0000#"+
		"$\u0005\b\u0000\u0000$%\u0005\t\u0000\u0000%&\u0005\r\u0000\u0000&\u0007"+
		"\u0001\u0000\u0000\u0000\'(\u0005\n\u0000\u0000(\t\u0001\u0000\u0000\u0000"+
		")*\u0005\u0004\u0000\u0000*+\u0005\u0002\u0000\u0000+\u000b\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0001\u0000\u0000-.\u0005\u0005\u0000\u0000./\u0005"+
		"\u000b\u0000\u0000/0\u0005\f\u0000\u000001\u0005\u000e\u0000\u000016\u0005"+
		"\f\u0000\u000023\u0005\u000f\u0000\u000035\u0005\f\u0000\u000042\u0001"+
		"\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u00007\r\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u0000\u0002\u00146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}