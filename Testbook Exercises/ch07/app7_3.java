//app7_3
public class app7_3{
	public static void main(String args[]){
		double num;
		num=show_length(8,4);
		System.out.println("length = "+num);
	}

	public static double show_length(int m, int n){
		return Math.sqrt(m*m+n*n);
	}
}