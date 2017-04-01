interface iShape2D{
	final double PI=3.14;
	abstract void area();
}

interface iColor{
	abstract void setColor(String str);
}

class CCircle implements iShape2D, iColor{
	double radius;
	String color;

	public CCircle(double r){
		radius=r;
	}

	public void setColor(String str){
		color=str;
		System.out.println("colcr = "+color);
	}

	public void area(){
		System.out.println("area = "+PI*radius*radius);
	}
}

public class app11_6{
	public static void main(String args[]){
		CCircle cir=new CCircle(2.0);
		cir.setColor("Blue");
		cir.area();
	}
}