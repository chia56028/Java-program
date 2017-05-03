import java.lang.Math.*;

interface iVolume{
	public abstract void showData();
	public abstract double vol();
}

abstract class CShpere implements iVolume{
	final double PI=3.14;
	protected int x;
	protected int y;

	public void showData(){
		System.out.println("The center of ball = ("+x+","+y+")");
		System.out.println("The radius of ball = "+CCircle.radius);
		System.out.println("The volume of ball = "+vol());
	}

	public double vol(){
		return (4*PI*CCircle.radius*CCircle.radius*CCircle.radius)/3;
	}
}

class CCircle extends CShpere{
	static int radius;

	CCircle(int a, int b, int r){
		x=a;
		y=b;
		radius=r;
	}
}

public class Test_0412_2{
	public static void main(String args[]){
		CCircle cir=new CCircle(8,6,2);
		cir.showData();
	}
}