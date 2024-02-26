grammar QAAL;

prog: dec operations Stop output+ EOF; //Main program
dec : input_reg* additional_reg* subroutines*; //Declaration of input registers/bits, additional registers/bits, and subroutines
input_reg: 'input' (reg | bit);
type: Bit | Qbit | Int | Bool | Unit | reg;
output: 'output' type Idfr ('[' Intlit ']')*;
reg: 'register' Idfr ':' Intlit ('bits' | 'qbits');
bit: ('bit' | 'qbit') Idfr;


//dec : type Idfr '(' vardec ')' body;
//vardec : (type Idfr (',' type Idfr)*)?;
//body : '{' (type Idfr ':=' exp ';')* ene '}';
//block : '{' ene '}';
//ene : exp (';' exp)*;
//exp : Idfr                              #IdfrExp
//|	Intlit                              #IntExp
//|	boolit                              #BoolExp
//|	Idfr ':=' exp                       #AssignExp
//|	'(' exp binop exp ')'               #BinopExp
//|	Idfr '(' args ')'                   #ArgExp
//|	block                               #BlockExp
//|	'print' exp                         #PrintExp
//;
//args : (exp (',' exp)*)?;
//binop :	CompExp| NumExp| BooleExp;
//boolit : True | False;
//cco : CX | CY | CZ;
//True : 'true';
//False : 'false';
//CompExp : '=='|'<'|'>'|'<='|'>=';
NumExp : '+'|'*'|'-'|'/';
//BooleExp : '&'|'|'|'^';
Bit: 'bit';
Qbit: 'qbit';
Int: 'int';
Unit: 'unit';
Bool: 'bool';
Stop: 'stop';
Intlit : '0' | ('-'? [1-9][0-9]*);
Keywords : 'print' | 'bits' | 'qbits' | 'jump' | 'if' | 'define' | 'input' | 'register';
Idfr : [a-z][A-Za-z0-9_]* ;
WS     : [ \n\r\t]+ -> skip ;