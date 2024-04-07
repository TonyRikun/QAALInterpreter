grammar QAAL;

prog: dec body Stop output+ EOF; //Main program - consists of declarations section, body, stop word, and output
//prog
dec: additional_reg* subroutines_dec*; //Declaration of input registers, additional registers, and subroutines
body: cs_dec* exp+;
output: 'output' (Bit Idfr | Reg Idfr Index?);
//dec
additional_reg: Operand? (reg_dec | bit_dec); //Declaration of additional registers that can also be operands
subroutines_dec: 'define' Idfr vardec ':' additional_reg* body Stop; //Declaration of subroutine, with read-only control statement parameters and operands
reg_dec: Reg Idfr ':' Intlit (Bits | Qubits); //Declaration of register consisting of bits/qubits
bit_dec: (Bit | Qubit) Idfr; //Declaration of a register that holds a single bit or qubit
vardec: ro_params? reg_params?; //Declaration of parameters
ro_params: '(' cs_type Idfr (',' cs_type Idfr)*')'; //Declaration of read-only parameters
reg_params: Idfr (',' Idfr)*; //Declaration of register parameters
//body
cs_dec: '!' cs_type Idfr ':=' arithmetic; //Declaration of classical varaibles; seperate from cs_exp because declarations of variables must be made before any kind of operations can be performed on them
cs_type: Angle | Int;

//All expressions
exp: '!' cs_exp                                                                     #CsExp //Control statements, all need to start with !
| (Classical_op | quantum_op | Swap) variable (',' variable)*                       #RegExp //Operations performed on registers and quantum registers
| 'Mz' variable '->' variable                                                       #MzExp //Measurement of a quantum register into classical register
| Idfr '(' args? ')' (variable (',' variable)*)                                     #InvokeExp //Invocation of a function
| label ':'                                                                         #LabelExp
;
//For SWAP, need to check if variables are of the same type
Classical_op: 'NOT' | 'CNOT' | 'CCNOT';
quantum_op: angle_rotation | Transformation; //Quantum operations that are either [controlled] rotations around an axis by a specified angle or other gates that don't require an angle parameter
angle_rotation: ('Rx' | 'Ry' | 'Rz' | 'CRx' | 'CRy' | 'CRz') '(' args ')';
Transformation: 'X' | 'Y' | 'Z' | 'H' | 'CX' | 'CY' | 'CZ' | 'CCX';
args: arithmetic (',' arithmetic)*; //Arguments passed to a subroutine/angle_rotation

//Jumps
jump: 'jump' label                                                                  #UncondJump //Unconditional jump
| 'if zero' variable ',' label                                                          #IfZeroJump //Jump if the variable is equal to 0
| 'if gtr' variable ',' variable ',' label                                                  #IfGtrJump //Jump if the first variable is greater than the second one
;
label: '@' Idfr;

//Control statements
cs_exp: jump                                                                        #CsJump //Conditional or uncoditional jumps
| 'randomise' variable                                                                #CsRand //Randomise function
| 'set' Idfr ':=' arithmetic                                                        #CsSet //Setting control statement variables to a value
;

arithmetic: Idfr                                                                    #IdfrArith //Arithmetic statement where the expression is an identifier
| Intlit                                                                            #IntArith //Arithmetic statement where the expression is an integer
| Pi                                                                                #PiArith //Arithmetic statement where the expression is a value of pi
| ('(' arithmetic NumExp arithmetic ')')                                            #CombArith //Arithmetic statement where the expression is a combination of above with an additional numeric operator
;
variable: Idfr Index?;
//type: Bit | Qubit | Int | Bool | Unit | Reg | Angle;

Comment: '#' ~('\r' | '\n')* -> skip;
Swap: 'SWAP';
NumExp: '+'|'*'|'-'|'/';
Index: '[' Intlit ']';
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
Keywords: 'jump' | 'if' | 'define' | 'input' | 'randomise';
Idfr: [A-Za-z][A-Za-z0-9_]* ;
WS: [ \n\r\t]+ -> skip ;