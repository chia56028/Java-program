interface Data{
	public void best();
	public void failed();
}

interface Test extends Data{
	public void showData();
	public double average();
}

class CStu implements Test{
	protected String name;
	protected int math;
	protected int engligh;

	CStu(String n, int m, int e){
		name=n;
		math=m;
		engligh=e;
	}

	public void best(){
		if(math>engligh){
			System.out.println(name+"'s math is better than engligh.");
		}else{
			System.out.println(name+"'s engligh is better than math.");
		}
	}

	public void failed(){
		if(math<60){
			System.out.println(name+"'s math is failed.");
		}
		if(engligh<60){
			System.out.println(name+"'s engligh is failed.");
		}
	}

	public void showData(){
		System.out.println("student name = "+name);
		System.out.println("math score = "+math);
		System.out.println("engligh score = "+engligh);
		System.out.println("average score = "+average());
	}

	public double average(){
		return (math+engligh)/2;
	}

	public void show(){
		showData();
		best();
		failed();
	}
}

public class exercise12{
	public static void main(String args[]){
		CStu stu=new CStu("Judy",58,91);
		stu.show();
	}
}