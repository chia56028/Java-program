class CCircle{}

class CCoin extends CCircle{}

public class app11_8 extends CCoin{
	public static void main(String args[]){
		boolean status;
		CCoin coin=new CCoin();
		CCircle cir=new CCircle();
		app11_8 myobj=new app11_8();
		CCoin carr[]=new CCoin[5];

		status=(cir instanceof CCoin);
		System.out.println("cir instanceof CCoin? "+status);

		status=(myobj instanceof CCircle);
		System.out.println("myobj instanceof CCircle? "+status);

		status=(coin instanceof app11_8);
		System.out.println("coin instanceof app11_8? "+status);

		status=(coin instanceof CCircle);
		System.out.println("coin instanceof CCircle? "+status);

		status=(coin instanceof CCoin);
		System.out.println("coin instanceof CCoin? "+status);

		status=(carr instanceof Object);
		System.out.println("carr instanceof Object? "+status);

		//incompatible types
		//status=(cir instanceof String);
		//System.out.println("cir instanceof String? "+status);

	}
}