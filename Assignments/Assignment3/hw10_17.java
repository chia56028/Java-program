class Car{
	protected String owner;
	protected String id;

	public Car(String own, String s){
		owner=own;
		id=s;
	}

	final void show(){
		System.out.println("Owner:"+owner);
		System.out.println("Plate number:"+id);
	}
}

class CColor extends Car{
	public String color;

	public CColor(String own, String s, String col){
		super(own,s);
		color=col;
	}

	public void showColor(){
		super.show();
		System.out.println("Color:"+color);
	}
}

public class hw10_17{
	public static void main(String args[]){
		CColor mycar=new CColor("Riaan","A1-2345","Black");
		mycar.showColor();
	}
}