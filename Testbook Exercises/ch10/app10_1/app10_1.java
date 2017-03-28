//define the CCircle superclass
class CCircle{
	private static double pi=3.14;
	private double radius;

	//define the CCircle constructor
	public CCircle(){
		System.out.println("CCircle() constructor called ");
	}
	public void setRadius(double r){
		radius=r;
		System.out.println("radius="+radius);
	}
	public void show(){
		System.out.println("area="+pi*radius*radius);
	}
}
//define the CCion subclass
class CCoin extends CCircle{
	private int value;

	public CCoin(){
		System.out.println("CCoin() constructor called ");
	}
	public void Setvalue(int t){
		value=t;
		System.out.println("value="+value);
	} 
}

public class app10_1{
	public static void main(String ages[]){
		CCoin coin=new CCoin();
		coin.setRadius(2.0);
		coin.show();
		coin.Setvalue(5);
	}
}