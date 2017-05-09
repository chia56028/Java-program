import java.util.*;

public class app16_03{
	public static void main(String args[]){
		HashSet<String> hest=new HashSet<String>();
		String str1="Puppy";
		String str2="Kitty";

		System.out.println("HashSet empty : "+hest.isEmpty());

		hest.add("Monkey");
		hest.add("Bunny");
		hest.add(str1);
		hest.add(str2);

		System.out.println("\nHashSet's size : "+hest.size());
		System.out.println("HashSet empty : "+hest.isEmpty());
		System.out.println("HashSet : "+hest);

		hest.remove(str2);
		System.out.println("\nAfter remove str2, HashSet's size : "+hest.size());
		System.out.println("Is str2(Kitty) in the HashSet? "+hest.contains(str2));

		System.out.println("\nIs fish in the HashSet? "+hest.contains("fish"));
		
		System.out.println("\nIs bunny in the HashSet? "+hest.contains("Bunny"));
		hest.remove("Bunny");
		System.out.println("After remove Bunny, HashSet's size : "+hest.size());

		System.out.println("\nHashSet : "+hest);
		hest.clear();
		System.out.println("After clear HashSet, does HashSet empty : "+hest.isEmpty());
	}
}