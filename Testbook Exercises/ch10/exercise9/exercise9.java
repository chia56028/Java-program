class Caaa{
	private int num;

	public Caaa(){}

	public Caaa(int n){
		num=n;
	}

	public int get(){
		return num;
	}

	public void show(){}

	public void display(){
		System.out.println("printed from Caaa class");
	}
}

class Cbbb extends Caaa{
	public Cbbb(){}

	public Cbbb(int n){
		super(n);
	}

	public void show(){
		System.out.println("num = "+super.get());
	}

	public void display(){
		System.out.println("printed from Cbbb class");
	}
}

public class exercise9{
	public static void main(String[] args) {
		Caaa bb=new Cbbb();
		bb.show();
		bb.display();
	}
}