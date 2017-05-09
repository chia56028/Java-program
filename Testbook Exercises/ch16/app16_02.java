public class app16_02{
	public static void main(String args[]){
		CMember<Integer> obj1=new CMember<Integer>();
		CMember<String> obj2=new CMember<String>();

		obj1.setid(6);
		obj1.show();

		obj2.setid("Lily");
		obj2.show();
	}
}

class CMember<T>{
	private T id;

	public void setid(T value){
		id=value;
	}

	public void show(){
		System.out.println("id = "+id);
	}
}	
