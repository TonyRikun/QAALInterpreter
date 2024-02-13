grammar QAAL;

prog : dec+ EOF;
dec : type Idfr '(' vardec ')' body;
vardec : (type Idfr (',' type Idfr)*)?;
body : '{' (type Idfr ':=' exp ';')* ene '}';
block : '{' ene '}';
ene : exp (';' exp)*;
exp : Idfr                              #IdfrExp
|	Intlit                              #IntExp
|	boolit                              #BoolExp
|	Idfr ':=' exp                       #AssignExp
|	'(' exp binop exp ')'               #BinopExp
|	Idfr '(' args ')'                   #ArgExp
|	block                               #BlockExp
|	'if' exp 'then' block 'else' block  #IfExp
|	'while' exp 'do' block              #WhileExp
|	'repeat' block 'until' exp          #RepeatExp
|	'print' exp                         #PrintExp
|	'space'                             #SpaceExp
|	'newline'                           #NewlineExp
|	'skip'                              #SkipExp
;
args : (exp (',' exp)*)?;
binop :	CompExp| NumExp| BooleExp;
type : Int | Bool | Unit;
boolit : True | False;
cco : CX | CY | CZ;

True : 'true';
False : 'false';
CompExp : '=='|'<'|'>'|'<='|'>=';
NumExp : '+'|'*'|'-'|'/';
BooleExp : '&'|'|'|'^';
Int : 'int';
Bool: 'bool';
Unit: 'unit';
Keywords : 'if'|'then'|'else'|'while'|'do'|'repeat'|'until'|'print'|'space'|'newline'|'skip'|'qubit'|'bit';
Intlit : '0' | ('-'? [1-9][0-9]*) ;
Idfr : [a-z][A-Za-z0-9_]* ;
WS     : [ \n\r\t]+ -> skip ;