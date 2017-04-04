class CBox{
	int length;
	int width;
	int height;

	int volume(){
		return length*width*height;
	}

	int surfureArea(){
		return 2*(length*width+width*height+height*length);
	}

	void showData(){
		System.out.println("length = "+length);
		System.out.println("width = "+width);
		System.out.println("height = "+height);
	}

	void showAll(){
		System.out.println("length = "+length);
		System.out.println("width = "+width);
		System.out.println("height = "+height);
		System.out.println("volume = "+volume());
		System.out.println("surfureArea = "+surfureArea());
	}
}

public class exercise5{
	public static void main(String args[]){
		CBox box=new CBox();

		box.length=1;
		box.width=1;
		box.height=1;

		box.showData();
		System.out.println("......................");
		box.showAll();
	}
}