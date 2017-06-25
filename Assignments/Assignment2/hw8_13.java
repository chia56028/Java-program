class CCircle{
	static double area(double r){
		return 3.14*r*r;
	}

	static float area(float r){
		return 3.14f*r*r;
	}

	static int area(int r){
		return (int)(3.14*r*r);
	}
}

public class hw8_13{
	public static void main(String args[]){
		System.out.println("area(2) = "+CCircle.area(2));
		System.out.println("area(2.2f) = "+CCircle.area(2.2f));
		System.out.println("area(2.2) = "+CCircle.area(2.2));
	}
}