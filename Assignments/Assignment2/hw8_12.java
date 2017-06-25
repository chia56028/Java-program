class Cwin{
	int width;
	int height;
	String name;

	void setW(int w){
		width=w;
	}

	void setH(int h){
		height=h;
	}

	void setWindows(int w, int h){
		width=w;
		height=h;
	}

	void setName(String s){
		name=s;
	}

	void setWindows(int w, int h, String s){
		width=w;
		height=h;
		name=s;
	}

	public void show(){
		System.out.println("name = "+name);
		System.out.println("W = "+width+", H = "+height);
	}
}

public class hw8_12{
	public static void main(String args[]){
		Cwin cw=new Cwin();
		cw.setName("My windows");
		cw.setW(5);
		cw.setH(3);
		cw.show();

		//cw.setWindows(1,2);
		//cw.show();

		//cw.setWindows(3,4,"aaa");
		//cw.show();
	}
}