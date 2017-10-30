/**
 * Define a grammar called Test
 */
grammar Test;

prog: lines+ ;

lines : 		expression NEWLINE
	  |			ID '=' expression
	  |			NEWLINE			
	  ;
expression : 	term
		   | 	term ('+'|'-') term
		   ;			

term : 			CONSTANT 
	 | 			CONSTANT VARIABLE 
	 | 			CONSTANT VARIABLE ('^') CONSTANT 
	 | 			VARIABLE 
	 | 			VARIABLE ('^') CONSTANT
	 ;

ID :			'@' [a-zA-Z]+ ;	// match identifiers 
CONSTANT : 		[0-9]+ ;		// match constants
VARIABLE : 		[a-z] ;			// match variables
NEWLINE :		'\r'? '\n' ;	// return newlines to parser (is end-statement signal)
WS:				[\t' ']+ -> skip ; // toss out whitespace
