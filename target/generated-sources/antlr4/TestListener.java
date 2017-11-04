// Generated from Test.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull TestParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull TestParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull TestParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull TestParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(@NotNull TestParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(@NotNull TestParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull TestParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull TestParser.ProgContext ctx);
}