import java.util.*;

public class app16_06{
	public static void main(String args[]){
		ArrayList<Integer> alist=new ArrayList<Integer>();

		for(int i=10; i<=50; i+=10) alist.add(i);
		System.out.println("Elements of ArrayList : "+alist);
		System.out.println("Number of elements : "+alist.size());
		
		alist.add(3,200);
		System.out.println("\nalist.add(3,200)");
		System.out.println("Elements of ArrayList : "+alist);
		alist.add(0,300);
		System.out.println("\nalist.add(0,300)");
		System.out.println("Elements of ArrayList : "+alist);
		alist.add(400);
		System.out.println("\nalist.add(400)");
		System.out.println("Elements of ArrayList : "+alist);

		alist.set(1,200);
		System.out.println("\nReplace element of index 1 with 200 ...");
		System.out.println("Elements of ArrayList : "+alist);
		System.out.println("The index of first '200' : "+alist.indexOf(200));
		System.out.println("The index of last '200' : "+alist.lastIndexOf(200));
	}
}