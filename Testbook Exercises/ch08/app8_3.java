//app8_3
class CRectangle{
	int width;
	int height;

	int area(){
		return width*height;
	}

	int perimeter(){
		return 2*(width+height);
	}
}

public class app8_3{
	public static void main(String args[]){
		CRectangle rect1;
		rect1=new CRectangle();

		rect1.width=20;
		rect1.height=15;

		System.out.println("area="+rect1.area());
		System.out.println("perimeter="+rect1.perimeter());
	}
}



