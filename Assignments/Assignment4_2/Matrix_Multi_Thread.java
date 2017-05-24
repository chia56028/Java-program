/* You can cancel the comment to see the result of matrix multiplication */
/* You can alter the size in class Matrix_Multi_Thread to save time */

import java.util.*;

public class Matrix_Multi_Thread{
	public static final int size=1000;
	public static int[][] mul=new int[size][size];
	
	public static void main(String args[]) throws InterruptedException{
		new Matrix();
		//=========================================================
		long startTime01=System.currentTimeMillis();

		mul=new int[size][size];
		SingleThread st=new SingleThread();
		st.multiply();

		// for(int i=0; i<size; i++){
		// 	for(int j=0; j<size; j++){
		// 		System.out.print(mul[i][j]+"\t");
		// 	}
		// 	System.out.println();
		// }

		long endTime01=System.currentTimeMillis();
		//=========================================================
		// System.out.println("............................................");
		//=========================================================

		mul=new int[size][size];

		long startTime02=System.currentTimeMillis();

		MultiThread mt=new MultiThread();
		mt.start=0;
		mt.end=size/2;
		new Thread(mt).start();

		mt=new MultiThread();
		mt.start=size/2;
		mt.end=size;
		new Thread(mt).start();

		// for(int i=0; i<size; i++){
		// 	for(int j=0; j<size; j++){
		// 		System.out.print(mul[i][j]+"\t");
		// 	}
		// 	System.out.println();
		// }
		long endTime02=System.currentTimeMillis();
		while(mul[size-1][size-1]==0) endTime02=System.currentTimeMillis();
		
		//========================================================
		System.out.println("While size of matrix = "+size);
		System.out.println("SingleThread Time : "+(endTime01-startTime01));
		System.out.println("MultiThread Time : "+(endTime02-startTime02));
		
	}
}

class Matrix{
	public int s;
	public static int[][] m1;
	public static int[][] m2;
	
	public Matrix(){
		s=Matrix_Multi_Thread.size;
		m1=new int[s][s];
		m2=new int[s][s];

		init();
		// print();
	}

	public void init(){
		Random rand=new Random(System.currentTimeMillis());
		for(int i=0; i<s; i++){
			for(int j=0; j<s; j++){
				m1[i][j]=rand.nextInt(3);
			}
		}
		for(int i=0; i<s; i++){
			for(int j=0; j<s; j++){
				m2[i][j]=rand.nextInt(3);
			}
		}
	}

	public void print(){
		for(int i=0; i<s; i++){
			for(int j=0; j<s; j++){
				System.out.print(m1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<s; i++){
			for(int j=0; j<s; j++){
				System.out.print(m2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}

class MultiThread extends Thread{
	int s=Matrix_Multi_Thread.size;
	int i, j;
	
	int start=0, end=s;

	public MultiThread(){}

	public void run(){
		for(int i=start; i<end; i++){
			for(int j=0; j<s; j++){
				for(int k=0; k<s; k++){
					Matrix_Multi_Thread.mul[i][j]+=Matrix.m1[i][k]*Matrix.m2[k][j];
				}
			}
		}
	}
}

class SingleThread extends Thread{
	int s;
	int i, j;

	public SingleThread(){
		s=Matrix_Multi_Thread.size;
	}

	public void multiply(){
		for(int i=0; i<s; i++){
			for(int j=0; j<s; j++){
				for(int k=0; k<s; k++){
					Matrix_Multi_Thread.mul[i][j]+=Matrix.m1[i][k]*Matrix.m2[k][j];
				}
			}
		}
	}

}