class CCircle{
	double pi=3.14;
	double radious;

	void show_peripherey(){
		System.out.println("peripherey = "+2*this.pi*this.radious);
	}
}

public class exercise6{
	public static void main(String args[]){
		CCircle cir1=new CCircle();

		cir1.radious=3.0;

		cir1.show_peripherey();
	}
}