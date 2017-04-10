import java.lang.Math.*;

interface iVolume{
	public abstract void showData();
	public abstract double vol();
}

abstract class CShpere implements iVolume{
	final double PI=3.14;
	protected int x;
	protected int y;
	public abstract void showData();
	public abstract double vol();
}

class CCircle extends CShpere{
	int radius;

	CCircle(int a, int b, int r){
		x=a;
		y=b;
		radius=r;
	}

	public void showData(){
		System.out.println("The center of ball = ("+x+","+y+")");
		System.out.println("The radius of ball = "+radius);
		System.out.println("The volume of ball = "+vol());
	}

	public double vol(){
		return (4/3)*PI*java.lang.Math.pow(radius,3);
	}
}

public class exercise14{
	public static void main(String args[]){
		CCircle cir=new CCircle(8,6,2);
		cir.showData();
	}
}