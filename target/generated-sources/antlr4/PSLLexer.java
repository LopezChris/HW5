// Generated from PSL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, START=9, 
		FINISH=10, ORDER=11, IDENTIFIER=12, INTEGER=13, X=14, POWER=15, ADD_OP=16, 
		MUL_OP=17, NEWLINE=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "START", 
		"FINISH", "ORDER", "IDENTIFIER", "INTEGER", "X", "POWER", "ADD_OP", "MUL_OP", 
		"NEWLINE", "WS"
	};


	public PSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PSL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\rR\n\r\f\r\16\rU\13"+
		"\r\3\16\6\16X\n\16\r\16\16\16Y\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\5\23g\n\23\3\23\3\23\3\23\3\23\3\24\6\24n\n\24\r\24\16"+
		"\24o\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\6\6\2CY[\\cy{|\5\2\62"+
		";C\\c|\3\2\62;\4\2\13\13\"\"v\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5"+
		"+\3\2\2\2\7.\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2"+
		"\2\2\219\3\2\2\2\23<\3\2\2\2\25B\3\2\2\2\27I\3\2\2\2\31O\3\2\2\2\33W\3"+
		"\2\2\2\35[\3\2\2\2\37]\3\2\2\2!_\3\2\2\2#b\3\2\2\2%f\3\2\2\2\'m\3\2\2"+
		"\2)*\7B\2\2*\4\3\2\2\2+,\7?\2\2,-\7#\2\2-\6\3\2\2\2./\7/\2\2/\60\7@\2"+
		"\2\60\b\3\2\2\2\61\62\7*\2\2\62\n\3\2\2\2\63\64\7+\2\2\64\f\3\2\2\2\65"+
		"\66\7-\2\2\66\16\3\2\2\2\678\7/\2\28\20\3\2\2\29:\7=\2\2:;\7+\2\2;\22"+
		"\3\2\2\2<=\7U\2\2=>\7V\2\2>?\7C\2\2?@\7T\2\2@A\7V\2\2A\24\3\2\2\2BC\7"+
		"H\2\2CD\7K\2\2DE\7P\2\2EF\7K\2\2FG\7U\2\2GH\7J\2\2H\26\3\2\2\2IJ\7Q\2"+
		"\2JK\7T\2\2KL\7F\2\2LM\7G\2\2MN\7T\2\2N\30\3\2\2\2OS\t\2\2\2PR\t\3\2\2"+
		"QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\32\3\2\2\2US\3\2\2\2VX\t\4\2"+
		"\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\34\3\2\2\2[\\\7z\2\2\\\36"+
		"\3\2\2\2]^\7`\2\2^ \3\2\2\2_`\7-\2\2`a\7#\2\2a\"\3\2\2\2bc\7,\2\2cd\7"+
		"#\2\2d$\3\2\2\2eg\7\17\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\f\2\2ij\3"+
		"\2\2\2jk\b\23\2\2k&\3\2\2\2ln\t\5\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op"+
		"\3\2\2\2pq\3\2\2\2qr\b\24\2\2r(\3\2\2\2\7\2SYfo\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}