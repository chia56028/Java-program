class Caaa{
	private int num;

	public Caaa(){}

	public Caaa(int n){
		num=n;
	}

	public int get(){
		return num;
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
}

public class exercise5{
	public static void main(String[] args) {
		Cbbb bb=new Cbbb(2);
		bb.show();
	}
}