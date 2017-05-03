import java.util.Scanner;

class Test{
  int math;
  int english;
}
  
class Data{
	private String name;
	private Test score;
	
	public Data(String n, int a, int b){
	  name=n;
	  score = new Test();
	  score.math=a;
	  score.english=b;
	}

	public static void show(Data[] datas){
		int summath=0;
		int sumengligh=0;

		for(int i=0; i<3; i++){
			summath+=datas[i].score.math;
			sumengligh+=datas[i].score.english;	
		}

		System.out.println("average of math score = "+(summath/3)+", average of english score = "+(sumengligh/3));
	}
}

public class Test_0322{
	public static void main(String args[]){
	  
		Scanner scn=new Scanner(System.in);
		
		Data[] student;
		student=new Data[3];
		
		String sn;
		  int ssm, sse;
		  for(int i=0; i<3; i++){
		    System.out.println("Please input the name of student"+(i+1)+":");
		    sn=scn.next();
		    System.out.println("Please input the math score of student"+(i+1)+":");
		    ssm=scn.nextInt();
		    System.out.println("Please input the engligh score of student"+(i+1)+":");
		    sse=scn.nextInt();
		    student[i]=new Data(sn, ssm, sse);
		  }
		  
		Data.show(student);
	}
	
}