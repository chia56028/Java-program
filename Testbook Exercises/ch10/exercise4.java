class CRectangle{
	private int length;
	private int width;

	CRectangle(){
		length=2;
		width=2;
	}

	CRectangle(int l, int w){
		length=l;
		width=w;
	}

	private void show(){
		System.out.println("length = "+length);
		System.out.println("width = "+width);
	}

	void area(){
		System.out.println("length = "+length);
		System.out.println("width = "+width);
		System.out.println("area = "+length*width);
	}
}

class CData extends CRectangle{
	CData(){
		super();
	}
	
	CData(int l, int w){
		super(l,w);
	}
}

public class exercise4{
	public static void main(String[] args) {
		CData obj1=new CData(3,8);
		CData obj2=new CData();
		obj1.area();
		obj2.area();
	}
}