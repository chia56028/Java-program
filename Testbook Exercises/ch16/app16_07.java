import java.util.*;

public class app16_07{
	public static void main(String args[]){
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();

		hmap.put(94001,"Fiona");
		hmap.put(94003,"Ariel");
		hmap.put(94002,"Ryan");

		System.out.println("Number of elements : "+hmap.size());
		System.out.println("Elements of HashMap : "+hmap);
		System.out.println("Is there a key '94002' in HashMap ? "+hmap.containsKey(94002));
		System.out.println("Is there a value 'Kevin' in HashMap ? "+hmap.containsValue("Kevin"));

		hmap.remove(94001);
		System.out.println("\nAfter delete the data of key '94001' ...");
		System.out.println("Number of elements : "+hmap.size());
		System.out.println("Elements of HashMap : "+hmap);
		System.out.println("The value of key '94003' : "+hmap.get(94003));
	}
}