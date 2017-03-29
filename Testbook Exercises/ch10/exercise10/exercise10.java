class Caaa{
	public Caaa(){}
}

class Cbbb extends Caaa{
	public Cbbb(){
		super();
	}
}

class Cccc extends Cbbb{
	public Cccc(){
		super();
	}
}

public class exercise10{
	public static void main(String args[]){
		Caaa a1=new Caaa();
		Caaa a2=new Cbbb();
		Caaa a3=new Cccc();
		/* Syntax Error
			Cbbb b1=new Caaa();
			You cannot write this because Caaa is Cbbb's super class.
		*/
		Cbbb b2=new Cbbb();
		Cbbb b3=new Cccc();
		/* Systax Error
			Cccc c1=new Caaa();
			Cccc c2=new Cbbb();
		*/
		
	}
}