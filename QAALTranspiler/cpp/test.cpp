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
#include <fstream>
#include <sstream>
const double PI = 3.141592653589793;
std::vector<int> ctrls = {0, 1};
std::vector<int> targs = {2};
template <size_t N>
bool isZero(std::array<int, N>& myArr) {
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
void quregSwap(QuESTEnv env, Qureg& reg1, Qureg& reg2) {
	Qureg temp = createCloneQureg(reg1, env);
	cloneQureg(reg1, reg2);
	cloneQureg(reg2, temp);
	destroyQureg(temp, env);
}
template <size_t N>
void measureQureg(Qureg& reg, std::array<int, N>& myArr){
	for (int i = 0; i < reg.numQubitsRepresented; i++){
		myArr[i] = measure(reg, i);
	}
}
template <size_t N>
std::string regToString(std::array<int, N> reg){
	std::string strOut;
	for (int i = 0; i < reg.size(); i++){
		strOut += std::to_string(reg[i]);
	}
	return strOut;
}
void f1 (QuESTEnv env, int  b, qreal  c, Qureg& q1) {
hadamard(q1,  0);
}

int main(int argc, char* argv[]) {
std::array<unsigned long int, 1> seedArray = {static_cast<unsigned long int>(std::time(NULL))};
	int numSeeds = 1;
	int batchSize = 1;
	if (argc > 1){
		batchSize = std::stoi(argv[1]);
	}
std::ofstream rOut("../../results.txt");
rOut << batchSize << " " << 2 << "\n";
rOut << "ba" <<  " " << "bb" <<  " " << "\n";
for (int batch = 0; batch < batchSize; batch++){
std::srand((unsigned int)std::time(NULL) + batch);

QuESTEnv env = createQuESTEnv();
seedArray[0] += batch;
seedQuEST(&env, seedArray.data(), numSeeds);
Qureg qa = createQureg(1, env);
initZeroState(qa);
Qureg qb = createQureg(1, env);
initZeroState(qb);
bool ba = 0;
bool bb = 0;
int d = 3;
qreal p = ( ( 1 / 2 ) * PI );
f1(env, d, p, qa);
pauliX(qb,  0);
hadamard(qb,  0);
ba = measure(qa,  0);
bb = measure(qb,  0);
rOut << ba << " " << bb << " " << "\n";
destroyQureg(qa, env);
destroyQureg(qb, env);
destroyQuESTEnv(env);
}
rOut.close();
return 0;
}
