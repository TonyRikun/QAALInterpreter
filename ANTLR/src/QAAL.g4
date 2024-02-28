grammar QAAL;

prog: dec operations Stop output+ EOF; //Main program
dec: input_reg* additional_reg* subroutines_dec*; //Declaration of input registers/bits, additional registers/bits, and subroutines
input_reg: 'input' (reg_dec | bit_dec);
additional_reg: ('operand')? (reg_dec | bit_dec); //Declaration of additional registers/bits that can also be operands
subroutines_dec: 'define' Idfr '(' vardec ')' '[' vardec ']' ':' operations;
vardec: (type Idfr (',' type Idfr)*)?;
operations: additional_reg*;
output: 'output' (Reg | Bit) Idfr ('[' Intlit ']')?;
reg_dec: Reg Idfr ':' Intlit ('bits' | 'qbits');
bit_dec: (Bit | Qbit) Idfr;
type: Bit | Qbit | Int | Bool | Unit | Reg;


//dec : type Idfr '(' vardec ')' body;
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
Reg: 'register';
Bit: 'bit';
Qbit: 'qbit';
Int: 'int';
Unit: 'unit';
Bool: 'bool';
Stop: 'stop';
Intlit : '0' | ('-'? [1-9][0-9]*);
Keywords : 'print' | 'bits' | 'qbits' | 'jump' | 'if' | 'define' | 'input' | 'operand';
Idfr : [a-z][A-Za-z0-9_]* ;
WS     : [ \n\r\t]+ -> skip ;