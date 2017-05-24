import java.util.*;

public class Test_0524{
	public static void main(String args[]){
		LinkedList<String> llist=new LinkedList<String>();

		Scanner scn=new Scanner(System.in);
		String str;

		boolean check=true;
		while(true){
			check=true;
			str=scn.nextLine();

			for(String i : llist){
				if(str.equals(i)) check=false;
			}
			/*for(int i=0; i<llist.size(); i++){
				if(str.equals(llist.get(i))) check=false;
			}*/

			if(check==true) llist.add(str);
			System.out.println(llist);
		}
	}
}

