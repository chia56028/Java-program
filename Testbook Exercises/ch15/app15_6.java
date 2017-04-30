class Ctest extends Thread{
	private String id;

	public Ctest(String str){
		id=str;
	}

	public void run(){
		for(int i=0; i<4; i++){
			try{
				sleep((int)(1000*Math.random()));
			}
			catch(InterruptedException e){}
			System.out.println(id+" is running...");
		}
	}
}

public class app15_6{
	public static void main(String args[]){
		Ctest dog=new Ctest("doggy");
		Ctest cat=new Ctest("Kitty");
		dog.start();
		try{
			dog.join();
			cat.start();
			cat.join();
		}catch(InterruptedException e){}
		System.out.println("main() finished");
	}
}