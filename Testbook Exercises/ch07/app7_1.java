//app7_1
public class app7_1{
	//main() function
	public static void main(String agrs[]){

		star();
		System.out.println("Knowledge is power.");
		star();
	}
	//define star() function
	public static void star(){
		for(int i=0; i<20; i++){
			System.out.print('*');
		}
		/*
		if you want to shift a line:
		1. System.out.println();
		2. System.out.print("\n");
		*/
		System.out.println();
	}
}

