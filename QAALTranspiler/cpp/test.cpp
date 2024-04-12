#include <QuEST.h>
#include <stdio.h>
#include <iostream>
#include <array>
#include <string>
#include <bitset>
#include <ctime>
#include <cstdlib>
#include <vector>
#include <utility>
const double PI = 3.141592653589793;
std::vector<int> ctrls = {0, 1};
std::vector<int> targs = {2};
template <size_t N>

bool isZero(std::array<int, N>& myArr){
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
    return reg1.to_ulong() > reg2.to_ulong(); 
}

void quregSwap(QuESTEnv env, Qureg& reg1, Qureg& reg2){
	Qureg temp = createCloneQureg(reg1, env);
	cloneQureg(reg1, reg2);
	cloneQureg(reg2, temp);
	destroyQureg(temp, env);
}

void myFunc(QuESTEnv env, Qureg a){
		Qureg qubit = createQureg(1, env);
		initZeroState(qubit);
		hadamard(a, 0);
		printf("%d was measured", measure(a, 0));
		destroyQureg(qubit, env);
	}
	

int main() {
	std::srand((unsigned int)std::time(NULL));
	
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
	//myFunc(env, a);
	std::array<int, 5> myArr1 = {};
	std::array<int, 5> myArr2 = {1};
	//std::cout <<  "\n" << compareRegs(myArr2, myArr1) << "\n";
	//if (isZero(myArr1)) std::cout << "HELLO\n";
	//bool ran=std::rand() % 2;
	//std::cout << ran;
	//bool xor1 = 0;
	//bool xor2 = 0;
	//std::cout << "\n XOR" << (xor1 ^ (xor1 & xor2));
	pauliX(a, 0);
	hadamard(a, 0);
	rotateX(a, 0, PI * (1/2));
	
	Qureg bitA = createQureg(3, env);
	initZeroState(bitA);
	Qureg regB = createQureg(3, env);
	initZeroState(regB);
	rotateX(bitA, 0, PI);
	//controlledRotateX(regB, con, tar, angle);
	//controlledNot(reg, 0, 1);
	pauliX(regB, 0);
	hadamard(regB, 1);
	ctrls = {0,1};
	targs = {2};
	multiControlledMultiQubitNot(regB, ctrls.data(), 2, targs.data(), 1);
	int d = 5;
	int t = 6;
	std::swap(d, t);
	quregSwap(env, bitA, regB);

	std::cout << "\n" << bitA.to_string();
	
	
	
	// unload QuEST
	destroyQureg(qubits, env); 
	destroyQuESTEnv(env);
	return 0;
}