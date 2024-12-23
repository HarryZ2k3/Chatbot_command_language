// Generated from c:/Users/trieu/Downloads/Chatbot_command_language-main/Chatbot_command_language-main/ChatBotCommand.g4 by ANTLR 4.13.1
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, STRING=40, DATETIME=41, WS=42;
	public static final int
		RULE_command = 0, RULE_createEvent = 1, RULE_showTasks = 2, RULE_updateEvent = 3, 
		RULE_helpCommand = 4, RULE_showEvent = 5, RULE_createTasks = 6, RULE_timeToEvent = 7, 
		RULE_greetingCommand = 8, RULE_partialCreateCommand = 9, RULE_partialTimeTo = 10, 
		RULE_partialUpdate = 11, RULE_partialShow = 12, RULE_partialCreate = 13, 
		RULE_afterCreate = 14, RULE_partialEvent = 15, RULE_partialTask = 16, 
		RULE_partialGreeting = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"command", "createEvent", "showTasks", "updateEvent", "helpCommand", 
			"showEvent", "createTasks", "timeToEvent", "greetingCommand", "partialCreateCommand", 
			"partialTimeTo", "partialUpdate", "partialShow", "partialCreate", "afterCreate", 
			"partialEvent", "partialTask", "partialGreeting"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'event'", "'at'", "'show'", "'tasks'", "'update'", 
			"'change'", "'time'", "'to'", "'help'", "'for'", "':'", "','", "'hi'", 
			"'hello'", "'hey'", "'t'", "'i'", "'m'", "'e'", "'u'", "'p'", "'d'", 
			"'a'", "'s'", "'h'", "'o'", "'w'", "'c'", "'r'", "'ev'", "'eve'", "'even'", 
			"'ta'", "'tas'", "'task'", "'he'", "'hel'", "'hell'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "STRING", "DATETIME", "WS"
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
		public TimeToEventContext timeToEvent() {
			return getRuleContext(TimeToEventContext.class,0);
		}
		public PartialCreateCommandContext partialCreateCommand() {
			return getRuleContext(PartialCreateCommandContext.class,0);
		}
		public GreetingCommandContext greetingCommand() {
			return getRuleContext(GreetingCommandContext.class,0);
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				createEvent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				showTasks();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				updateEvent();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				helpCommand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				showEvent();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				createTasks();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				timeToEvent();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(43);
				partialCreateCommand();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(44);
				greetingCommand();
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
			setState(47);
			match(T__0);
			setState(48);
			match(T__1);
			setState(49);
			match(STRING);
			setState(50);
			match(T__2);
			setState(51);
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
			setState(53);
			match(T__3);
			setState(54);
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
			setState(56);
			match(T__5);
			setState(57);
			match(T__1);
			setState(58);
			match(STRING);
			setState(59);
			match(T__6);
			setState(60);
			match(T__7);
			setState(61);
			match(T__8);
			setState(62);
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
			setState(64);
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
			setState(66);
			match(T__3);
			setState(67);
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
			setState(69);
			match(T__0);
			setState(70);
			match(T__4);
			setState(71);
			match(T__10);
			setState(72);
			match(STRING);
			setState(73);
			match(T__11);
			setState(74);
			match(STRING);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(75);
				match(T__12);
				setState(76);
				match(STRING);
				}
				}
				setState(81);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TimeToEventContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ChatBotCommandParser.STRING, 0); }
		public TimeToEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeToEvent; }
	}

	public final TimeToEventContext timeToEvent() throws RecognitionException {
		TimeToEventContext _localctx = new TimeToEventContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_timeToEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__7);
			setState(83);
			match(T__8);
			setState(84);
			match(T__1);
			setState(85);
			match(STRING);
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
	public static class GreetingCommandContext extends ParserRuleContext {
		public GreetingCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greetingCommand; }
	 
		public GreetingCommandContext() { }
		public void copyFrom(GreetingCommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreetingContext extends GreetingCommandContext {
		public TerminalNode STRING() { return getToken(ChatBotCommandParser.STRING, 0); }
		public GreetingContext(GreetingCommandContext ctx) { copyFrom(ctx); }
	}

	public final GreetingCommandContext greetingCommand() throws RecognitionException {
		GreetingCommandContext _localctx = new GreetingCommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_greetingCommand);
		int _la;
		try {
			_localctx = new GreetingContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(88);
				match(T__12);
				setState(89);
				match(STRING);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartialCreateCommandContext extends ParserRuleContext {
		public PartialCreateContext partialCreate() {
			return getRuleContext(PartialCreateContext.class,0);
		}
		public AfterCreateContext afterCreate() {
			return getRuleContext(AfterCreateContext.class,0);
		}
		public PartialShowContext partialShow() {
			return getRuleContext(PartialShowContext.class,0);
		}
		public PartialUpdateContext partialUpdate() {
			return getRuleContext(PartialUpdateContext.class,0);
		}
		public PartialTimeToContext partialTimeTo() {
			return getRuleContext(PartialTimeToContext.class,0);
		}
		public PartialGreetingContext partialGreeting() {
			return getRuleContext(PartialGreetingContext.class,0);
		}
		public PartialCreateCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialCreateCommand; }
	}

	public final PartialCreateCommandContext partialCreateCommand() throws RecognitionException {
		PartialCreateCommandContext _localctx = new PartialCreateCommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_partialCreateCommand);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				partialCreate();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 135292649508L) != 0)) {
					{
					setState(93);
					afterCreate();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==T__24) {
					{
					setState(96);
					partialShow();
					setState(97);
					afterCreate();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5 || _la==T__20) {
					{
					setState(101);
					partialUpdate();
					setState(102);
					afterCreate();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7 || _la==T__16) {
					{
					setState(106);
					partialTimeTo();
					setState(107);
					afterCreate();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 962139897856L) != 0)) {
					{
					setState(111);
					partialGreeting();
					setState(112);
					afterCreate();
					}
				}

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
	public static class PartialTimeToContext extends ParserRuleContext {
		public PartialTimeToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialTimeTo; }
	}

	public final PartialTimeToContext partialTimeTo() throws RecognitionException {
		PartialTimeToContext _localctx = new PartialTimeToContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_partialTimeTo);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__16);
				{
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(119);
					match(T__17);
					}
				}

				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(122);
					match(T__18);
					}
				}

				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(125);
					match(T__19);
					}
					break;
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(128);
					match(T__8);
					}
				}

				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__7);
				setState(132);
				match(T__8);
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
	public static class PartialUpdateContext extends ParserRuleContext {
		public PartialUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialUpdate; }
	}

	public final PartialUpdateContext partialUpdate() throws RecognitionException {
		PartialUpdateContext _localctx = new PartialUpdateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_partialUpdate);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__20);
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(136);
					match(T__21);
					}
				}

				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(139);
					match(T__22);
					}
				}

				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(142);
					match(T__23);
					}
				}

				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(145);
					match(T__16);
					}
					break;
				}
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(148);
					match(T__19);
					}
					break;
				}
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__5);
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
	public static class PartialShowContext extends ParserRuleContext {
		public PartialShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialShow; }
	}

	public final PartialShowContext partialShow() throws RecognitionException {
		PartialShowContext _localctx = new PartialShowContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_partialShow);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__24);
				{
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(155);
					match(T__25);
					}
				}

				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(158);
					match(T__26);
					}
				}

				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(161);
					match(T__27);
					}
				}

				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(T__3);
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
	public static class PartialCreateContext extends ParserRuleContext {
		public PartialCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialCreate; }
	}

	public final PartialCreateContext partialCreate() throws RecognitionException {
		PartialCreateContext _localctx = new PartialCreateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_partialCreate);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__28);
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(168);
					match(T__29);
					}
				}

				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(171);
					match(T__19);
					}
					break;
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(174);
					match(T__23);
					}
				}

				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(177);
					match(T__16);
					}
					break;
				}
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(180);
					match(T__19);
					}
					break;
				}
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__0);
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
	public static class AfterCreateContext extends ParserRuleContext {
		public PartialTaskContext partialTask() {
			return getRuleContext(PartialTaskContext.class,0);
		}
		public PartialEventContext partialEvent() {
			return getRuleContext(PartialEventContext.class,0);
		}
		public AfterCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afterCreate; }
	}

	public final AfterCreateContext afterCreate() throws RecognitionException {
		AfterCreateContext _localctx = new AfterCreateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_afterCreate);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__16:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				partialTask();
				}
				break;
			case T__1:
			case T__19:
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				partialEvent();
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
	public static class PartialEventContext extends ParserRuleContext {
		public PartialEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialEvent; }
	}

	public final PartialEventContext partialEvent() throws RecognitionException {
		PartialEventContext _localctx = new PartialEventContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partialEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15033434116L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartialTaskContext extends ParserRuleContext {
		public PartialTaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialTask; }
	}

	public final PartialTaskContext partialTask() throws RecognitionException {
		PartialTaskContext _localctx = new PartialTaskContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_partialTask);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259215392L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartialGreetingContext extends ParserRuleContext {
		public PartialGreetingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialGreeting; }
	}

	public final PartialGreetingContext partialGreeting() throws RecognitionException {
		PartialGreetingContext _localctx = new PartialGreetingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_partialGreeting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962139897856L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\u0004\u0001*\u00c5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000.\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006N\b\u0006\n\u0006\f\u0006"+
		"Q\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\b[\b\b\u0001\t\u0001\t\u0003\t_\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\td\b\t\u0001\t\u0001\t\u0001\t\u0003\ti\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\tn\b\t\u0001\t\u0001\t\u0001\t\u0003\ts\b\t\u0003"+
		"\tu\b\t\u0001\n\u0001\n\u0003\ny\b\n\u0001\n\u0003\n|\b\n\u0001\n\u0003"+
		"\n\u007f\b\n\u0001\n\u0003\n\u0082\b\n\u0001\n\u0001\n\u0003\n\u0086\b"+
		"\n\u0001\u000b\u0001\u000b\u0003\u000b\u008a\b\u000b\u0001\u000b\u0003"+
		"\u000b\u008d\b\u000b\u0001\u000b\u0003\u000b\u0090\b\u000b\u0001\u000b"+
		"\u0003\u000b\u0093\b\u000b\u0001\u000b\u0003\u000b\u0096\b\u000b\u0001"+
		"\u000b\u0003\u000b\u0099\b\u000b\u0001\f\u0001\f\u0003\f\u009d\b\f\u0001"+
		"\f\u0003\f\u00a0\b\f\u0001\f\u0003\f\u00a3\b\f\u0001\f\u0003\f\u00a6\b"+
		"\f\u0001\r\u0001\r\u0003\r\u00aa\b\r\u0001\r\u0003\r\u00ad\b\r\u0001\r"+
		"\u0003\r\u00b0\b\r\u0001\r\u0003\r\u00b3\b\r\u0001\r\u0003\r\u00b6\b\r"+
		"\u0001\r\u0003\r\u00b9\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u00bd\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0004\u0001"+
		"\u0000\u000e\u0010\u0003\u0000\u0002\u0002\u0014\u0014\u001f!\u0003\u0000"+
		"\u0005\u0005\u0011\u0011\"$\u0003\u0000\u000e\u0010\u001a\u001a%\'\u00db"+
		"\u0000-\u0001\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u00045"+
		"\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\b@\u0001\u0000"+
		"\u0000\u0000\nB\u0001\u0000\u0000\u0000\fE\u0001\u0000\u0000\u0000\u000e"+
		"R\u0001\u0000\u0000\u0000\u0010W\u0001\u0000\u0000\u0000\u0012t\u0001"+
		"\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u0098\u0001"+
		"\u0000\u0000\u0000\u0018\u00a5\u0001\u0000\u0000\u0000\u001a\u00b8\u0001"+
		"\u0000\u0000\u0000\u001c\u00bc\u0001\u0000\u0000\u0000\u001e\u00be\u0001"+
		"\u0000\u0000\u0000 \u00c0\u0001\u0000\u0000\u0000\"\u00c2\u0001\u0000"+
		"\u0000\u0000$.\u0003\u0002\u0001\u0000%.\u0003\u0004\u0002\u0000&.\u0003"+
		"\u0006\u0003\u0000\'.\u0003\b\u0004\u0000(.\u0003\n\u0005\u0000).\u0003"+
		"\f\u0006\u0000*.\u0003\u000e\u0007\u0000+.\u0003\u0012\t\u0000,.\u0003"+
		"\u0010\b\u0000-$\u0001\u0000\u0000\u0000-%\u0001\u0000\u0000\u0000-&\u0001"+
		"\u0000\u0000\u0000-\'\u0001\u0000\u0000\u0000-(\u0001\u0000\u0000\u0000"+
		"-)\u0001\u0000\u0000\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-,\u0001\u0000\u0000\u0000.\u0001\u0001\u0000\u0000\u0000/0\u0005"+
		"\u0001\u0000\u000001\u0005\u0002\u0000\u000012\u0005(\u0000\u000023\u0005"+
		"\u0003\u0000\u000034\u0005)\u0000\u00004\u0003\u0001\u0000\u0000\u0000"+
		"56\u0005\u0004\u0000\u000067\u0005\u0005\u0000\u00007\u0005\u0001\u0000"+
		"\u0000\u000089\u0005\u0006\u0000\u00009:\u0005\u0002\u0000\u0000:;\u0005"+
		"(\u0000\u0000;<\u0005\u0007\u0000\u0000<=\u0005\b\u0000\u0000=>\u0005"+
		"\t\u0000\u0000>?\u0005)\u0000\u0000?\u0007\u0001\u0000\u0000\u0000@A\u0005"+
		"\n\u0000\u0000A\t\u0001\u0000\u0000\u0000BC\u0005\u0004\u0000\u0000CD"+
		"\u0005\u0002\u0000\u0000D\u000b\u0001\u0000\u0000\u0000EF\u0005\u0001"+
		"\u0000\u0000FG\u0005\u0005\u0000\u0000GH\u0005\u000b\u0000\u0000HI\u0005"+
		"(\u0000\u0000IJ\u0005\f\u0000\u0000JO\u0005(\u0000\u0000KL\u0005\r\u0000"+
		"\u0000LN\u0005(\u0000\u0000MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\r\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005\b\u0000\u0000ST\u0005\t"+
		"\u0000\u0000TU\u0005\u0002\u0000\u0000UV\u0005(\u0000\u0000V\u000f\u0001"+
		"\u0000\u0000\u0000WZ\u0007\u0000\u0000\u0000XY\u0005\r\u0000\u0000Y[\u0005"+
		"(\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0011"+
		"\u0001\u0000\u0000\u0000\\^\u0003\u001a\r\u0000]_\u0003\u001c\u000e\u0000"+
		"^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_u\u0001\u0000\u0000"+
		"\u0000`a\u0003\u0018\f\u0000ab\u0003\u001c\u000e\u0000bd\u0001\u0000\u0000"+
		"\u0000c`\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000du\u0001\u0000"+
		"\u0000\u0000ef\u0003\u0016\u000b\u0000fg\u0003\u001c\u000e\u0000gi\u0001"+
		"\u0000\u0000\u0000he\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"iu\u0001\u0000\u0000\u0000jk\u0003\u0014\n\u0000kl\u0003\u001c\u000e\u0000"+
		"ln\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000nu\u0001\u0000\u0000\u0000op\u0003\"\u0011\u0000pq\u0003\u001c\u000e"+
		"\u0000qs\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000su\u0001\u0000\u0000\u0000t\\\u0001\u0000\u0000\u0000tc\u0001"+
		"\u0000\u0000\u0000th\u0001\u0000\u0000\u0000tm\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000u\u0013\u0001\u0000\u0000\u0000vx\u0005\u0011"+
		"\u0000\u0000wy\u0005\u0012\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000z|\u0005\u0013\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000"+
		"\u0000}\u007f\u0005\u0014\u0000\u0000~}\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080\u0082"+
		"\u0005\t\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0086\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"\b\u0000\u0000\u0084\u0086\u0005\t\u0000\u0000\u0085v\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0015\u0001\u0000\u0000"+
		"\u0000\u0087\u0089\u0005\u0015\u0000\u0000\u0088\u008a\u0005\u0016\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u008d\u0005\u0017\u0000"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0090\u0005\u0018\u0000"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u0093\u0005\u0011\u0000"+
		"\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0096\u0005\u0014\u0000"+
		"\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0099\u0005\u0006\u0000"+
		"\u0000\u0098\u0087\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u0017\u0001\u0000\u0000\u0000\u009a\u009c\u0005\u0019\u0000"+
		"\u0000\u009b\u009d\u0005\u001a\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000"+
		"\u0000\u009e\u00a0\u0005\u001b\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a3\u0005\u001c\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0005\u0004\u0000\u0000\u00a5\u009a\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u0019\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a9\u0005\u001d\u0000\u0000\u00a8\u00aa\u0005\u001e\u0000"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005\u0014\u0000"+
		"\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005\u0018\u0000"+
		"\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00b3\u0005\u0011\u0000"+
		"\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b6\u0005\u0014\u0000"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\u0001\u0000"+
		"\u0000\u00b8\u00a7\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u001b\u0001\u0000\u0000\u0000\u00ba\u00bd\u0003 \u0010\u0000"+
		"\u00bb\u00bd\u0003\u001e\u000f\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u001d\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0007\u0001\u0000\u0000\u00bf\u001f\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0007\u0002\u0000\u0000\u00c1!\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0007\u0003\u0000\u0000\u00c3#\u0001\u0000\u0000\u0000\u001f-O"+
		"Z^chmrtx{~\u0081\u0085\u0089\u008c\u008f\u0092\u0095\u0098\u009c\u009f"+
		"\u00a2\u00a5\u00a9\u00ac\u00af\u00b2\u00b5\u00b8\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}