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

public class app11_3{
	public static void main(String[] args) {
		CShape shape[]=new CShape[2];
		
		shape[0]=new CRectangle(5,10);
		shape[0].setColor("Yellow");
		shape[0].show();

		shape[1]=new CCircle(2.0);
		shape[1].setColor("Green");
		shape[1].show();
	}
}