#include <iostream>
using namespace std;

int main(int argc, char** argv) {
	int N;
	while(cin>>N){
		int pref[N/2];
		int m=0;
		int sum=0;
		
		for(int i=1; i<N+1; i++){
			sum=1;
			for(int j=2; j<i; j++){
				if(i%j==0) sum+=j;
			}
			
			if(sum==i) pref[m++]=i;
		}
		
		for(int i=1; i<m; i++){
			if(i!=m-1) cout<<pref[i]<<" ";
			else cout<<pref[i]<<endl;
		}
	}
	return 0;
}
