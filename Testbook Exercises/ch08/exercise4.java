class CBox{
	int length;
	int width;
	int height;
}

public class exercise4{
	public static void main(String args[]){
		CBox box=new CBox();

		box.length=15;
		box.width=10;
		box.height=25;

		System.out.println("length = "+box.length);
		System.out.println("width = "+box.width);
		System.out.println("height = "+box.height);
	}
}