class CRectangle{
	int wigth;
	int height;
}

public class app8_2{
	public static void main(String args[]){
		CRectangle rect1, rect2;
		rect1=new CRectangle();
		rect2=new CRectangle();

		rect1.wigth=20;
		rect1.height=15;

		rect2.wigth=25;
		rect2.height=rect1.height+3;

		System.out.println("rect1.wigth="+rect1.wigth);
		System.out.println("rect1.height="+rect1.height);
		System.out.println("rect2.wigth="+rect2.wigth);
		System.out.println("rect2.height="+rect2.height);
	}
}