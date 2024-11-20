// Generated from g:/WORK/CODE/Chatbot_command_language/ChatBotCommand.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ChatBotCommandLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		QUOTEDSTRING=10, DATETIME=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"QUOTEDSTRING", "DATETIME", "DIGIT", "WS"
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


	public ChatBotCommandLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ChatBotCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\fo\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\tO\b\t\n\t\f\tR\t"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0004\fj\b\f\u000b\f\f\fk\u0001"+
		"\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\u0000\u0019\f\u0001\u0000\u0003\u0001\u0000\"\"\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  o\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0001\u001b\u0001\u0000\u0000\u0000\u0003\"\u0001\u0000\u0000\u0000\u0005"+
		"(\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t0\u0001\u0000"+
		"\u0000\u0000\u000b6\u0001\u0000\u0000\u0000\r=\u0001\u0000\u0000\u0000"+
		"\u000fD\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000\u0000\u0013L"+
		"\u0001\u0000\u0000\u0000\u0015U\u0001\u0000\u0000\u0000\u0017f\u0001\u0000"+
		"\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001b\u001c\u0005c\u0000\u0000"+
		"\u001c\u001d\u0005r\u0000\u0000\u001d\u001e\u0005e\u0000\u0000\u001e\u001f"+
		"\u0005a\u0000\u0000\u001f \u0005t\u0000\u0000 !\u0005e\u0000\u0000!\u0002"+
		"\u0001\u0000\u0000\u0000\"#\u0005e\u0000\u0000#$\u0005v\u0000\u0000$%"+
		"\u0005e\u0000\u0000%&\u0005n\u0000\u0000&\'\u0005t\u0000\u0000\'\u0004"+
		"\u0001\u0000\u0000\u0000()\u0005a\u0000\u0000)*\u0005t\u0000\u0000*\u0006"+
		"\u0001\u0000\u0000\u0000+,\u0005s\u0000\u0000,-\u0005h\u0000\u0000-.\u0005"+
		"o\u0000\u0000./\u0005w\u0000\u0000/\b\u0001\u0000\u0000\u000001\u0005"+
		"t\u0000\u000012\u0005a\u0000\u000023\u0005s\u0000\u000034\u0005k\u0000"+
		"\u000045\u0005s\u0000\u00005\n\u0001\u0000\u0000\u000067\u0005u\u0000"+
		"\u000078\u0005p\u0000\u000089\u0005d\u0000\u00009:\u0005a\u0000\u0000"+
		":;\u0005t\u0000\u0000;<\u0005e\u0000\u0000<\f\u0001\u0000\u0000\u0000"+
		"=>\u0005c\u0000\u0000>?\u0005h\u0000\u0000?@\u0005a\u0000\u0000@A\u0005"+
		"n\u0000\u0000AB\u0005g\u0000\u0000BC\u0005e\u0000\u0000C\u000e\u0001\u0000"+
		"\u0000\u0000DE\u0005t\u0000\u0000EF\u0005i\u0000\u0000FG\u0005m\u0000"+
		"\u0000GH\u0005e\u0000\u0000H\u0010\u0001\u0000\u0000\u0000IJ\u0005t\u0000"+
		"\u0000JK\u0005o\u0000\u0000K\u0012\u0001\u0000\u0000\u0000LP\u0005\"\u0000"+
		"\u0000MO\b\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\"\u0000\u0000T\u0014\u0001"+
		"\u0000\u0000\u0000UV\u0003\u0017\u000b\u0000VW\u0003\u0017\u000b\u0000"+
		"WX\u0003\u0017\u000b\u0000XY\u0003\u0017\u000b\u0000YZ\u0005-\u0000\u0000"+
		"Z[\u0003\u0017\u000b\u0000[\\\u0003\u0017\u000b\u0000\\]\u0005-\u0000"+
		"\u0000]^\u0003\u0017\u000b\u0000^_\u0003\u0017\u000b\u0000_`\u0005 \u0000"+
		"\u0000`a\u0003\u0017\u000b\u0000ab\u0003\u0017\u000b\u0000bc\u0005:\u0000"+
		"\u0000cd\u0003\u0017\u000b\u0000de\u0003\u0017\u000b\u0000e\u0016\u0001"+
		"\u0000\u0000\u0000fg\u0007\u0001\u0000\u0000g\u0018\u0001\u0000\u0000"+
		"\u0000hj\u0007\u0002\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0006\f\u0000\u0000n\u001a\u0001\u0000\u0000\u0000"+
		"\u0003\u0000Pk\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}