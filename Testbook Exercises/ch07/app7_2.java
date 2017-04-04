//app7_2
public class app7_2{
	public static void main(String agrs[]){
		int i;
		i=star(9);
		System.out.println(i+" stars printed");
	}

	public static int star(int n){
		for(int i=0; i<=2*n; i++){
			System.out.print("*");
		}
		System.out.print("\n");
		return 2*n;
	}
}