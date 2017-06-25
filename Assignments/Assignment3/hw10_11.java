class CShape{
	public double area(){
		return 0.0;
	}

	static void largest(CShape[] shp){
		double lar=shp[0].area();
		for(int i=0; i<6; i++){
			if(shp[i].area()>lar){
				lar=shp[i].area();
			}
		}
		System.out.println("largest = "+lar);
	}
}

class CCircle extends CShape{
	double radius;

	CCircle(double r){
		radius=r;
	}

	public double area(){
		return 3.14*radius*radius;
	}
}

class CSquare extends CShape{
	double length;

	CSquare(double l){
		length=l;
	}
	public double area(){
		return length*length;
	}
}

class CTriangle extends CShape{
	double base, height;

	CTriangle(double b, double h){
		base=b;
		height=h;
	}

	public double area(){
		return 0.5*base*height;
	}
}

public class hw10_11{
	public static void main(String args[]){
		/*
		CCircle cc1=new CCircle(1);
		CCircle cc2=new CCircle(6);
		CSquare cs1=new CSquare(2);
		CSquare cs2=new CSquare(5);
		CTriangle ct1=new CTriangle(3,3);
		CTriangle ct2=new CTriangle(4,4);
		*/

		CShape shp[]=new CShape[6];
		shp[0]=new CCircle(1);
		shp[1]=new CCircle(6);
		shp[2]=new CSquare(2);
		shp[3]=new CSquare(5);
		shp[4]=new CTriangle(3,3);
		shp[5]=new CTriangle(4,4);
		CShape.largest(shp);

	}
}