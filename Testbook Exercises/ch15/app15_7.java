class Ctest extends Thread{
	private String id;

	public Ctest(String str){
		id=str;
	}

	public void run(){
		for(int i=0; i<3; i++){
			try{
				//sleep 1sec
				sleep(1000);
			}
			catch(InterruptedException e){}
			System.out.println(id+" is running... Priority = "+this.getPriority());
		}
	}
}

public class app15_7{
	public static void main(String args[]){
		Ctest dog=new Ctest("doggy");
		Ctest cat=new Ctest("Kitty");
		Ctest rabbit=new Ctest("rabbit");
		Ctest sheep=new Ctest("sheep");
		Ctest horse=new Ctest("horse");

		cat.setPriority(Thread.MAX_PRIORITY);
		dog.setPriority(Thread.MIN_PRIORITY);
		rabbit.setPriority(7);
		sheep.setPriority(3);

		dog.start();
		cat.start();
		rabbit.start();
		sheep.start();
		horse.start();
	}
}