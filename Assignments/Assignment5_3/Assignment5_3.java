import java.util.*;

public class Assignment5_3{
	public static void main(String args[]){
		while(true){
			Scanner scn=new Scanner(System.in);
			String str=scn.nextLine();

			String[] a=str.split(",");
			int[] abc=new int[3];
			int n=0;

			for(String aa : a){
				abc[n++]=Integer.valueOf(aa);
			}

			for(int i=0; i<10000; i++){
				for(int j=0; j<10000; j++){
					if(abc[0]*i+abc[1]*j==abc[2]) System.out.println(i+","+j);
					if(abc[0]*i+abc[1]*j>abc[2]) break;
				}
			}
		}
	}
}
