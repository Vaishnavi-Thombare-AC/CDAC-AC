#include <iostream>
using namespace std;

int main() {
	int statusReg  = 0b10110001;
	int controlReg = 0b00000000;
	int dataReg    = 0b11001010;



	//Can change Address or reference  but not value

	 const int *regPtr1 = &statusReg;
	 //regPtr1 =100; //error: invalid conversion from 'int' to 'const int*'
	 //*regPtr1 = &dataReg;
	 regPtr1 = &dataReg;
	 cout<< "statusReg"<<*regPtr1<<endl;


//Can change value but not address or reference

	int* const regPtr2 = &controlReg;
	 *regPtr2 = 100;
	 //regPtr2 = &dataReg;//error: assignment of read-only variable 'regPtr2'
	 cout<< "controlReg"<<*regPtr2<<endl;


//cannot change value and address or reference
	 const int* const regPtr3 = &statusReg;
	 //*regPtr3=100; //error: assignment of read-only location '*(const int*)regPtr3'
	 //regPtr3=&dataReg; //error: assignment of read-only variable 'regPtr3'
	 cout<< "statusReg"<<*regPtr3<<endl;




	return 0;
}
