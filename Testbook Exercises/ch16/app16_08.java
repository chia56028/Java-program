import java.util.*;

public class app16_08{
	public static void main(String args[]){
		int k1=94001, k2=94003, key;
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();

		tmap.put(94001,"Fiona");
		tmap.put(94003,"Ariel");
		tmap.put(94002,"Ryan");
		tmap.put(94004,"Jack");

		System.out.println("Number of elements : "+tmap.size());
		System.out.println("Elements of TreeMap : "+tmap);

		key=tmap.firstKey();
		System.out.println("\nFirst element(index 0) : "+key+", "+tmap.get(key));
		key=tmap.lastKey();
		System.out.println("Last element : "+key+", "+tmap.get(key));

		System.out.println("\nSubMap between '94001' and '94003' : "+tmap.subMap(k1,k2));
		System.out.println("SubMap greater than 94003 : "+tmap.tailMap(k2));
	}
}