// Generated from Test.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TestParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TestParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(TestParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(TestParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TestParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TestParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TestParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TestParser.TermContext ctx);
}