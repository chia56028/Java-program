import java.util.*;

public class Assignment5_2{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		while(true){
			int N=scn.nextInt();
			int[] pref=new int[N];
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
				if(i!=m-1) System.out.print(pref[i]+" ");
				else System.out.println(pref[i]);
			}
		}
	}
}