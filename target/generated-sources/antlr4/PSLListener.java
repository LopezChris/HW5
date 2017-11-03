// Generated from PSL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PSLParser}.
 */
public interface PSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PSLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PSLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PSLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PSLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PSLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_list(PSLParser.Decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_list(PSLParser.Decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(PSLParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(PSLParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#var_id}.
	 * @param ctx the parse tree
	 */
	void enterVar_id(PSLParser.Var_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#var_id}.
	 * @param ctx the parse tree
	 */
	void exitVar_id(PSLParser.Var_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#type_id}.
	 * @param ctx the parse tree
	 */
	void enterType_id(PSLParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#type_id}.
	 * @param ctx the parse tree
	 */
	void exitType_id(PSLParser.Type_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PSLParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PSLParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(PSLParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(PSLParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(PSLParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(PSLParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(PSLParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(PSLParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#order_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOrder_stmt(PSLParser.Order_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#order_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOrder_stmt(PSLParser.Order_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PSLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PSLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PSLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PSLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#polynomial}.
	 * @param ctx the parse tree
	 */
	void enterPolynomial(PSLParser.PolynomialContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#polynomial}.
	 * @param ctx the parse tree
	 */
	void exitPolynomial(PSLParser.PolynomialContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#monomial}.
	 * @param ctx the parse tree
	 */
	void enterMonomial(PSLParser.MonomialContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#monomial}.
	 * @param ctx the parse tree
	 */
	void exitMonomial(PSLParser.MonomialContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PSLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PSLParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(PSLParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(PSLParser.SignContext ctx);
}