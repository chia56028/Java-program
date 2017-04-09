class CTest{
	void test(int a){
		if(a%2==0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}
}

public class exercise7{
	public static void main(String args[]){
		CTest ctest=new CTest();
		ctest.test(0);
		ctest.test(3);
		ctest.test(8);
	}
}