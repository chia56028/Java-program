import java.util.*;

public class app16_05{
	public static void main(String args[]){
		LinkedList<Integer> llist=new LinkedList<Integer>();

		for(int i=10; i<=30; i+=10) llist.add(i);

		llist.addFirst(100);
		llist.addLast(200);
		llist.addFirst(300);

		System.out.println("Number of elements : "+llist.size());
		System.out.println("Elements of LinkedList : ");
		for(int i=0; i<llist.size(); i++) System.out.print(llist.get(i)+" ");

		System.out.println("\nDelete the last element "+llist.removeLast());

		System.out.println("First element : "+llist.getFirst());
		System.out.println("Last element : "+llist.getLast());
		System.out.println("The index of element '200' : "+llist.indexOf(200));
	}
}