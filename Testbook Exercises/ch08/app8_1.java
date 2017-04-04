class CRectangle{
	int width;
	int height;
}

public class app8_1{
	public static void main(String args[]){
		CRectangle rect1;
		rect1=new CRectangle();

		rect1.width=20;
		rect1.height=15;

		System.out.println("width="+rect1.width);
		System.out.println("height="+rect1.height);
	}
}