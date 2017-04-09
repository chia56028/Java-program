/*
Compile:
	c:\java>javac pack12_02\app12_02.java
	
Execute:
	c:\java>java pack12_02.app12_02
*/

package pack12_02;

class CCircle{
	public void show(){
		System.out.println("show() is called");
	}
}

public class app12_02{
	public static void main(String args[]){
		CCircle cir=new CCircle();
		cir.show();
	}
}