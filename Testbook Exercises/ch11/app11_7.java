interface iShape{
	final double PI=3.14;
	abstract void setColor(String str);
}

interface iShape2D extends iShape{
	abstract void area();
}

class CCircle implements iShape2D{
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

public class app11_7{
	public static void main(String args[]){
		CCircle cir=new CCircle(2.0);
		cir.setColor("Blue");
		cir.area();
	}
}