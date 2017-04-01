interface iShape2D{
	final double PI=3.14;
	abstract void area();
}

class CRectangle implements iShape2D{
	int width, height;

	public CRectangle(int w, int h){
		width=w;
		height=h;
	}

	public void area(){
		System.out.println("area = "+width*height);
	}
}

class CCircle implements iShape2D{
	double radius;

	public CCircle(double r){
		radius=r;
	}

	public void area(){
		System.out.println("area = "+PI*radius*radius);
	}
}

public class app11_5{
	public static void main(String args[]){
		iShape2D var1, var2;
		var1=new CRectangle(5,10);
		var1.area();

		var2=new CCircle(2.0);
		var2.area();
	}
}