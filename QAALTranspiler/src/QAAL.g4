grammar QAAL;

prog: dec body Stop output+ EOF; //Main program - consists of declarations section, body, stop word, and output
//prog
dec: additional_reg* subroutines_dec*; //Declaration of input registers, additional registers, and subroutines
body: additional_reg* cs_dec* exp+;
output: 'output' (Bit Idfr | Reg Idfr ('[' Intlit ']')?);
//dec
additional_reg: Operand? (reg_dec | bit_dec); //Declaration of additional registers that can also be operands
subroutines_dec: 'define' Idfr '(' vardec ')' vardec ':' body Stop; //Declaration of subroutine, with read-only control statement parameters and operands
reg_dec: Reg Idfr ':' Intlit (Bits | Qubits); //Declaration of register consisting of bits/qubits
bit_dec: (Bit | Qubit) Idfr; //Declaration of a register that holds a single bit or qubit
vardec: (Idfr (',' Idfr)*)?; //Declaration of parameters
//body
cs_dec: '!' Int Idfr ':=' Intlit; //Declaration of classical varaibles; seperate from cs_exp because declarations of variables must be made before any kind of operations can be performed on them

//All expressions
exp: '!' cs_exp                                                                     #CsExp //Control statements, all need to start with !
| (Classical_op | quantum_op) Idfr ('[' Intlit ']')? (',' Idfr ('[' Intlit ']')?)*  #RegExp //Operations performed on registers and quantum registers
| measurement                                                                       #MzExp //Measurement of a quantum register
| Idfr '(' args? ')' (Idfr (',' Idfr)*)?                                            #InvokeExp //Invocation of a function
| label ':'                                                                         #LabelExp
;

Classical_op: 'NOT' | 'CNOT' | 'CCNOT';
quantum_op: angle_rotation | Transformation; //Quantum operations that are either [controlled] rotations around an axis by a specified angle or other gates that don't require an angle parameter
angle_rotation: ('Rx' | 'Ry' | 'Rz' | 'CRx' | 'CRy' | 'CRz') '(' args ')';
Transformation: 'X' | 'Y' | 'Z' | 'H' | 'CX' | 'CY' | 'CZ' | 'CCX' | 'SWAP';
measurement: 'Mz' Idfr '->' Idfr; /*Needs to be modified to work with registers*/ //Measurement of a quantum register into classical register

label: '@' Idfr;
//Jumps
jump: 'jump' label                                                                  #UncondJump //Unconditional jump
| 'if zero' Idfr ',' label                                                          #IfZeroJump //Jump if the variable is equal to 0
| 'if gtr' Idfr ',' Idfr ',' label                                                  #IfGtrJump //Jump if the first variable is greater than the second one
;

//Control statements
cs_exp: jump //Conditional or uncoditional jumps
| 'randomise' Idfr //Randomise function
| 'set' Idfr ':=' arithmetic //Setting control statement variables to a value
| angle_dec //Declaration of an angle
;

arithmetic: Idfr                                                                    #IdfrArith //Arithmetic statement where the expression is an identifier
| Intlit                                                                            #IntArith //Arithmetic statement where the expression is an integer
| Pi                                                                                #PiArith //Arithmetic statement where the expression is a value of pi
| ('(' arithmetic NumExp arithmetic ')')                                            #CombArith //Arithmetic statement where the expression is a combination of above with an additional numeric operator
;
angle_dec: Angle Idfr ':=' arithmetic;
//type: Bit | Qubit | Int | Bool | Unit | Reg | Angle;
args: (Idfr | Intlit) (',' (Idfr | Intlit))*; //Arguments passed to a subroutine/angle_rotation

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
Operand: 'operand';
Pi: 'pi';
Bits: 'bits';
Qubits: 'qubits';
Intlit: '0' | ('-'? [1-9][0-9]*);
Keywords: 'print' | 'jump' | 'if' | 'define' | 'input' | 'randomise';
Idfr: [A-Za-z][A-Za-z0-9_]* ;
WS: [ \n\r\t]+ -> skip ;