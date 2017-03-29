//app10_2
class CCircle{
	private static double pi=3.14;
	private double radious;

	public CCircle(){
		System.out.println("CCircle() constructor called");
	}

	public CCircle(double r){
		System.out.println("CCircle(double r) constructor called");
		radious=r;
	}

	public void show(){
		System.out.println("area="+pi*radious*radious);
	}
}

class CCoin extends CCircle{
	private int value;
	public CCoin(){
		System.out.println("CCoin() constructor called");
	}
	public CCoin(double r, int v){
		super(r);
		value=v;
		System.out.println("CCoin(double r, int v) constructor called");
	}
}

public class app10_2{
	public static void main(String[] args) {
		CCoin coin1=new CCoin();
		CCoin coin2=new CCoin(2.5,10);
		coin1.show();
		coin2.show();
	}
}