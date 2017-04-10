interface Data{
	public void showData();
}

interface Test{
	public void showScore();
	public double Calcu();
}

class CStu implements Data, Test{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;

	CStu(String i, String n, int m, int f, int c){
		id=i;
		name=n;
		mid=m;
		finl=f;
		common=c;
	}

	public void showData(){
		System.out.println("student id = "+id);
		System.out.println("student name = "+name);
	}

	public void showScore(){
		System.out.println("student mid = "+mid);
		System.out.println("student finl = "+finl);
		System.out.println("student common = "+common);
	}

	public double Calcu(){
		return mid*0.3+finl*0.3+common*0.4;
	}

	public void show(){
		showData();
		showScore();
		System.out.println("student semester score = "+Calcu());
	}
}

public class exercise11{
	public static void main(String args[]){
		CStu stu=new CStu("940001","Fiona",90,92,85);
		stu.show();
	}
}