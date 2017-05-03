public class Test_0503{
	public static void main(String args[]){
		new Thread(){
			public void run(){
				for(int i=0; i<10; i++){
					try{
						sleep(500);
					}catch(InterruptedException e){}
					System.out.println("Hello "+(i+1));
				}
			}
		}.start();
	}
}
