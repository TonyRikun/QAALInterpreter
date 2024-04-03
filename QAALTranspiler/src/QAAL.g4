grammar QAAL;

prog: dec body Stop output+ EOF; //Main program - consists of declarations section, body, stop word, and output
//prog
dec: additional_reg* subroutines_dec*; //Declaration of input registers/bits, additional registers/bits, and subroutines
body: additional_reg* cs_dec* exp+;
output: 'output' (Bit Idfr ('[' Intlit ']')? | Reg Idfr);
//dec
additional_reg: ('operand' | 'input')? (reg_dec | bit_dec); //Declaration of additional registers/bits that can also be operands
subroutines_dec: 'define' Idfr '(' vardec ')' vardec ':' body Stop; //Declaration of subroutine, with read-only control statement parameters and operands
reg_dec: Reg Idfr ':' Intlit ('bits' | 'qubits'); //Declaration of register consisting of bits/qubits
bit_dec: (Bit | Qubit) Idfr; //Declaration of bit/qubit
vardec: (Idfr (',' Idfr)*)?; //Declaration of parameters
//body
cs_dec: '!' Int Idfr ':=' Intlit; //Declaration of classical varaibles; seperate from cs_exp because declarations of variables must be made before any kind of operations can be performed on them

//All expressions
exp: '!' cs_exp //Control statements, all need to start with !
| Classical_op (Idfr ('[' Intlit ']')? (',' Idfr ('[' Intlit ']')?)*) //Classsical operations performed on bits/registers
| quantum_op Idfr ('[' Intlit ']')? (',' Idfr ('[' Intlit ']')?)* //Quantum operations performed on qbuits/quantum registers
| measurement //Measurement of a qubit
| Idfr '(' args ')' (Idfr (',' Idfr)*)? //Invocation of a function
| Comment //Commenting
| label ':';

Classical_op: 'NOT' | 'CNOT' | 'CCNOT';
quantum_op: angle_rotation | Transformation; //Quantum operations that are either [controlled] rotations around an axis by a specified angle or other gates that don't require an angle parameter
angle_rotation: ('Rx' | 'Ry' | 'Rz' | 'CRx' | 'CRy' | 'CRz') '(' args ')';
Transformation: 'X' | 'Y' | 'Z' | 'H' | 'CX' | 'CY' | 'CZ' | 'CCX' | 'SWAP';
measurement: 'Mz' Idfr '->' Idfr; /*Needs to be modified to work with registers*/ //Measurement of a qubit/quantum register into bit/register

label: '@' Idfr;
//Jumps
jump: 'jump' (label //Unconditional jump
| 'if zero' Idfr ',' label //Jump if the variable is equal to 0
| 'if gtr' Idfr ',' Idfr ',' label); //Jump if the first variable is greater than the second one

//Control statements
cs_exp: arithmetic //Arithmetic expressions
| jump //Conditional or uncoditional jumps
| 'randomise' Idfr //Randomise function
| 'set' Idfr ':=' arithmetic //Setting control statement variables to a value
| angle_dec; //Declaration of an angle

arithmetic: (Idfr | Intlit | 'pi' | ('(' arithmetic NumExp arithmetic ')')); //Arithmetic statement where the expression is an integer, variable, value of pi or a combination of these with an additional numeric operator
angle_dec: Angle Idfr ':=' arithmetic;
//type: Bit | Qubit | Int | Bool | Unit | Reg | Angle;
args: ((Idfr | Intlit) (',' (Idfr | Intlit))*)?; //Arguments passed to a subroutine/angle_rotation

Comment: '#' ~('\r' | '\n')* -> skip;
NumExp: '+'|'*'|'-'|'/';
Reg: 'register';
Bit: 'bit';
Qubit: 'qubit';
Int: 'integer';
Angle: 'angle';
Unit: 'unit';
Bool: 'bool';
Stop: 'stop';
Intlit: '0' | ('-'? [1-9][0-9]*);
Keywords: 'print' | 'bits' | 'qubits' | 'jump' | 'if' | 'define' | 'input' | 'operand' | 'randomise' | 'pi';
Idfr: [A-Za-z][A-Za-z0-9_]* ;
WS: [ \n\r\t]+ -> skip ;