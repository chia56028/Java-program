class CTriangle{
	protected int base;
	protected int height;

	protected CTriangle(){}

	protected void show(){
		System.out.println("base = "+base+", height = "+height);
	}	
}

class CData extends CTriangle{
	CData(){}

	CData(int a, int b){
		base=a;
		height=b;
	}

	void area(){
		super.show();
		System.out.println("area = "+0.5*base*height);
	}
}

public class exercise6{
	public static void main(String args[]){
		CData obj=new CData(3,8);
		obj.area();
	}

}