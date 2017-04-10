class CShape{}

class CCircle extends CShape{}

class CTriangle extends CShape{}

class CCoin extends CCircle{}

public class exercise15{
	public static void main(String args[]){
		CCircle circle=new CCircle();
		CTriangle triangle=new CTriangle();
		CCoin coin=new CCoin();

		System.out.println("ccircle instanceof CCoin? "+(circle instanceof CCoin));
		System.out.println("triangle instanceof CShape? "+(triangle instanceof CShape));
		System.out.println("cion instanceof Object? "+(coin instanceof Object));
	}
}