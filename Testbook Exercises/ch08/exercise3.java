class Cddd{
	String name;
	double height;
	double weight;

	void printStudentData(){
		System.out.println("name = "+name);
		System.out.println("height = "+height);
		System.out.println("weight = "+weight);
	}

	void printBMI(){
		double BMI;
		BMI=weight/((height/100)*(height/100));
		System.out.println("BMI = "+BMI);
	}
}

public class exercise3{
	public static void main(String args[]){
		Cddd student=new Cddd();
		student.name="Sandy";
		student.height=165.5;
		student.weight=58.2;

		student.printStudentData();
		student.printBMI();
	}
}