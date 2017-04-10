interface Show_ans{
	public void show();
}

interface Math extends Show_ans{
	public void add(int a, int b);
	public void sub(int a, int b);
	public void mul(int a, int b);
	public void div(int a, int b);
}

class Compute implements Math{
	double ans;
	
	public void show(){
		System.out.println("ans = "+ans);
	}

	public void add(int a, int b){
		ans=a+b;
	}

	public void sub(int a, int b){
		ans=a-b;
	}

	public void mul(int a, int b){
		ans=a*b;
	}

	public void div(int a, int b){
		ans=a/b;
	}
}

public class exercise13{
	public static void main(String args[]){
		Compute cmp=new Compute();
		cmp.mul(3,5);
		cmp.show();
	}
}