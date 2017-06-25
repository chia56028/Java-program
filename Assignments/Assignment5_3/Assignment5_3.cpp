#include <iostream>
#include <string>
using namespace std;

int main(int argc, char** argv) {
	string str;
	while(getline(cin,str)){
		int len=str.length();
		int abc[3]={0};
		int n=0;
	
		for(int i=0; i<len; i++){
			if((int)str[i]==44)	n++;
			else abc[n]=abc[n]*10+(str[i]-48);
		}
		
//		for(int i=0; i<=n; i++){
//			cout<<abc[i]<<endl;
//		}

		for(int i=0; i<10000; i++){
			for(int j=0; j<10000; j++){
				if(abc[0]*i+abc[1]*j==abc[2]) cout<<i<<","<<j<<endl;
				if(abc[0]*i+abc[1]*j>abc[2]) break;
			}
		}
	}
	return 0;
}
