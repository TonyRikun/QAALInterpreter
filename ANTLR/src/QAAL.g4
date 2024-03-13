grammar QAAL;

prog: dec body Stop output+ EOF; //Main program
dec: additional_reg* subroutines_dec*; //Declaration of input registers/bits, additional registers/bits, and subroutines
additional_reg: ('operand' | 'input')? (reg_dec | bit_dec); //Declaration of additional registers/bits that can also be operands
subroutines_dec: 'define' Idfr '(' vardec ')' vardec ':' body; //Declaration of subroutine, with read-only control statement parameters and operands
cs_dec: '!' Int Idfr ':=' Intlit; //Declaration of classical varaibles; seperate from cs_exp because declarations of variables must be made before any kind of operations can be performed on them
vardec: (Idfr (',' Idfr)*)?; //Declaration of parameters
body: additional_reg* cs_dec* /*Need to add indent here*/ exp+;

//All expressions
exp: '!' cs_exp
| Classical_op (Idfr ('[' Intlit ']')? (',' Idfr ('[' Intlit ']')?)*)
| Quantum_op ('(' args ')')? (Idfr ('[' Intlit ']')? (',' Idfr ('[' Intlit ']')?)*)
| Idfr '(' args ')' (Idfr (',' Idfr)*)?
| Comment
| '@' Idfr ':';

//Control statements
cs_exp: arithmetic
| jump
| 'randomise' Idfr
| 'set' Idfr ':=' arithmetic
| angle_dec;

Classical_op: 'NOT' | 'CNOT' | 'CCNOT';
Quantum_op: 'Rx' | 'Ry' | 'Rz' | 'X' | 'Y' | 'Z' | 'H' | 'CX' | 'CY' | 'CZ' | 'CRx' | 'CRy' | 'CRz' | 'CCX';

arithmetic: Intlit | '(' arithmetic NumExp arithmetic ')';
angle_dec: Angle Idfr ':=' arithmetic 'pi';
output: 'output' (Bit Idfr ('[' Intlit ']')? | Reg Idfr);
reg_dec: Reg Idfr ':' Intlit ('bits' | 'qbits');
bit_dec: (Bit | Qbit) Idfr;
type: Bit | Qbit | Int | Bool | Unit | Reg | Angle;
args : ((Idfr | Intlit) (',' (Idfr | Intlit))*)?;
label: '@' Idfr ':';

//Jumps
jump: 'jump' (label
| 'if zero' Idfr ',' label
| 'if gtr' Idfr ',' Idfr ',' label);

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
//binop :	CompExp| NumExp| BooleExp;
//boolit : True | False;
//cco : CX | CY | CZ;
//True : 'true';
//False : 'false';
//CompExp : '=='|'<'|'>'|'<='|'>=';
Comment: '#' ~('\r' | '\n')* -> skip;
NumExp : '+'|'*'|'-'|'/';
//BooleExp : '&'|'|'|'^';
Reg: 'register';
Bit: 'bit';
Qbit: 'qbit';
Int: 'integer';
Angle: 'angle';
Unit: 'unit';
Bool: 'bool';
Stop: 'stop';
Intlit : '0' | ('-'? [1-9][0-9]*);
Keywords : 'print' | 'bits' | 'qbits' | 'jump' | 'if' | 'define' | 'input' | 'operand' | 'randomise' | 'pi';
Idfr : [A-Za-z][A-Za-z0-9_]* ;
WS     : [ \n\r\t]+ -> skip ;