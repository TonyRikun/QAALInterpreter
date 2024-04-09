#include <QuEST.h>
#include <stdio.h>

int main() {

  // load QuEST
  QuESTEnv env = createQuESTEnv();
  
  // create a 2 qubit register in the zero state
  Qureg qubits = createQureg(2, env);
  initZeroState(qubits);
	
  // apply circuit
  hadamard(qubits, 0);
  controlledNot(qubits, 0, 1);
  measure(qubits, 1);
  int outcome = measure(qubits, 0);
  printf("Qubit 0 was measured in state %d\n", outcome);
	
  // unload QuEST
  destroyQureg(qubits, env); 
  destroyQuESTEnv(env);
  return 0;
}