class CTriangle{
	protected int base;
	protected int height;

	protected void show(){
		System.out.println("base = "+base+", height = "+height);
	}	
}

class CData extends CTriangle{	
	CData(int a, int b){
		base=a;
		height=b;
	}

	void area(){
		this.show();
		System.out.println(", area = "+0.5*base*height+".");
	}

	protected void show(){
		System.out.print("base = "+base+", height = "+height);
	}
}

public class hw10_6{
	public static void main(String args[]){
		CData obj=new CData(3,8);
		obj.area();
	}

}