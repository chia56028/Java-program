abstract class CShape{
	protected String color;

	public void setColor(String str){
		color=str;
	}

	public abstract void show();
}

class CRectangle extends CShape{
	protected int width, height;

	public CRectangle(int w, int h){
		width=w;
		height=h;
	}

	public void show(){
		System.out.println("color = "+color+", ");
		System.out.println("area = "+width*height);
	}
}

class CCircle extends CShape{
	protected double radius;

	public CCircle(double r){
		radius=r;
	}

	public void show(){
		System.out.println("color = "+color+", ");
		System.out.println("area = "+3.14*radius*radius);
	}
}

public class app11_2{
	public static void main(String[] args) {
		CShape shape1=new CRectangle(5,10);
		shape1.setColor("Yellow");
		shape1.show();

		CShape shape2=new CCircle(2.0);
		shape2.setColor("Green");
		shape2.show();
	}
}