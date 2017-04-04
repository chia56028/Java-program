class Cbbb{
	double x;
	double y;

	void print(String a){
		System.out.println(a+".x="+x+", "+a+".y="+y);
	}
}

public class exercise2{
	public static void main(String args[]){
		Cbbb obj1=new Cbbb();
		Cbbb obj2=new Cbbb();
		Cbbb avg=new Cbbb();
		
		obj1.x=5.2;
		obj1.y=3.9;
		obj2.x=6.5;
		obj2.y=4.6;
		avg.x=(obj1.x+obj2.x)/2;
		avg.y=(obj1.y+obj2.y)/2;

		obj1.print("obj1");
		obj2.print("obj2");
		avg.print("avg");
	}
}