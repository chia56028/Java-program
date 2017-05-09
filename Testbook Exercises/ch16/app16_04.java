import java.util.*;

public class app16_04{
	public static void main(String args[]){
		TreeSet<Integer> tset=new TreeSet<Integer>();

		for(int i=20; i>=2; i-=2) tset.add(i);

		System.out.println("Number of TreeSet : "+tset.size());
		System.out.println("Elements of TreeSet : "+tset);
		System.out.println("First element : "+tset.first());
		System.out.println("Last element : "+tset.last());
		System.out.println("The subset between 6 to 14 : "+tset.subSet(6,14));
		System.out.println("The subset greater or equal to 10 : "+tset.tailSet(10));
		System.out.println("The subset less then 8 : "+tset.headSet(8));
	}
}