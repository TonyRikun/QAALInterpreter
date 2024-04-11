#include <QuEST.h>
#include <stdio.h>
#include <iostream>
#include <array>
#include <string>
#include <bitset>
using namespace std;
template <size_t N>

bool isZero(std::array<int, N>& myArr){//Don't forget to edit this bit in the code generator - & - and add all of the #include statements
	for(int i = 0; i < myArr.size(); i++) {
        if(myArr[i] != 0) {
            return false;
        }
    }
	return true;
}

template <size_t N>
bool compareRegs(std::array<int, N>& myArr1, std::array<int, N>& myArr2) {
    // Concatenate the values into a single string
    std::string concatenated1;
	std::string concatenated2;
    for (int i = 0; i < myArr1.size(); i++) {
        concatenated1 += std::to_string(myArr1[i]);
		concatenated2 += std::to_string(myArr2[i]);
    }
	std::bitset<N> reg1(concatenated1);
	std::bitset<N> reg2(concatenated2);
	//int result = (int)(byte.to_ulong());
    return reg1.to_ulong() > reg2.to_ulong(); //YOU ARE HERE: need to write this in the code generator and LOOK UP and then go back to comparing regs in jump
}

void myFunc(QuESTEnv env, Qureg a){
		Qureg qubit = createQureg(1, env);
		initZeroState(qubit);
		hadamard(a, 0);
		printf("%d was measured", measure(a, 0));
		destroyQureg(qubit, env);
	}

int main() {
	
	// load QuEST
	QuESTEnv env = createQuESTEnv();
  
	// create a 2 qubit register in the zero state
	Qureg qubits = createQureg(2, env);
	initZeroState(qubits);
	bool myBit = 0;
	
	// apply circuit
	hadamard(qubits, 0);
	controlledNot(qubits, 0, 1);
	measure(qubits, 1);
	myBit = measure(qubits, 0);
	printf("Qubit 0 was measured in state %d\n", myBit);
	std::cout << !myBit;
	Qureg a = createQureg(1, env);
	initZeroState(a);
	myFunc(env, a);
	std::array<int, 5> myArr1 = {};
	std::array<int, 5> myArr2 = {1};
	std::cout <<  "\n" << compareRegs(myArr2, myArr1) << "\n";
	if (isZero(myArr1)) std::cout << "HELLO";
	
	
	
	// unload QuEST
	destroyQureg(qubits, env); 
	destroyQuESTEnv(env);
	return 0;
}