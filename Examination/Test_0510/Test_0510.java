/*
Project:Test_0510
Hint:Use combination of math
Warn:Overflow while input greater than 27
*/

import java.util.*;

public class Test_0510{
	public static void main(String args[]) throws Exception{
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();

		System.out.println(new PT().getRow(num));
	}

	public List<Integer> getRow(int rowIndex){
		List<Integer> alist=new ArrayList<Integer>();
		int num=1;

		for(int i=0; i<=rowIndex; i++){
			alist.clear();
			num=1;
			for(int j=0; j<=i; j++){
				if(j>0)	num=num*((i+1)-j)/j;
				else num=1;
				alist.add(num);
				//System.out.print(num+" ");
			}
			//System.out.println();
		}

		return alist;
	}
}