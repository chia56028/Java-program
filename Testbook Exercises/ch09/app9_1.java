//app9_1, using the constructor

//define a CCircle class
class CCircle{
	private double pi=3.14;
	private double radius;

	//define a CCircle constructor
	public CCircle(double r){
		radius=r;
	}
	public void show(){
		System.out.println("radius="+radius+", area="+pi*radius*radius);
	}
}

public class app9_1{
	public static void main(String args[]){
		/*create an object cir1 of the CCircle class,
		  and assigns it to a variable to call the CCircle constructor. */
		CCircle cir1=new CCircle(4.0);
		cir1.show();
	}
}