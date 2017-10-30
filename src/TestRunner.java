import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class TestRunner 
{
	public static void main( String[] args) throws Exception 
	{

		@SuppressWarnings("deprecation")
		ANTLRInputStream input = new ANTLRInputStream( System.in);

		TestLexer lexer = new TestLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		TestParser parser = new TestParser(tokens);
		ParseTree tree = parser.prog(); // begin parsing at rule 'r'
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	}
}