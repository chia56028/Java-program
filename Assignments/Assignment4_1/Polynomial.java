import java.util.*;

public class Polynomial{
	static LinkedList<Term> llist=new LinkedList<Term>();

	public static void main(String args[]){
		Polynomial p=new Polynomial(new Term(-10,0));
		p.add(new Polynomial(new Term(-1,1)));
		p.add(new Polynomial(new Term(9,7)));
		p.add(new Polynomial(new Term(5,10)));
		p.print();

		Polynomial q=p.multiply(p);
		q.print();
	}
	
	public Polynomial(){

	}

	public Polynomial(Term t){
		boolean check=false;
		for(int i=0; i<llist.size(); i++){
			if(check==true) break;
			if(t.exponent==llist.get(i).exponent){
				llist.get(i).coefficient+=t.coefficient;
				check=true;
			}
		}
		if(check==false) llist.add(t);
	}

	public Polynomial add(Polynomial p){
		return new Polynomial();
	}

	public Polynomial multiply(Polynomial p){
		int n=llist.size();
		int[] coeff=new int[n];
		int[] expon=new int[n];
		for(int i=0; i<n; i++) coeff[i]=llist.get(i).coefficient;
		for(int i=0; i<n; i++) expon[i]=llist.get(i).exponent;

		llist.clear();
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				int coe=coeff[i]*coeff[j];
				int exp=expon[i]+expon[j];
				p.add(new Polynomial(new Term(coe,exp)));
			}
		}

		return p;
	}

	public void print(){
		for(int i=0; i<llist.size(); i++){
			System.out.print(llist.get(i).toString());
			if(i==llist.size()-1) System.out.println();
		}
	}
}
//===================================================================
class Term{
	int coefficient;
	int exponent;

	public Term() {
	    this(0,0);
    }

	public Term(int coeff, int expon){
		coefficient=coeff;
		exponent=expon;
	}

	public String toString(){
		if(coefficient<0) return coefficient+"x^"+exponent+" ";
		else return "+"+coefficient+"x^"+exponent+" ";
	}

	public int getCoeff() {
		return coefficient;
    }

	public int getExpon() {
		return exponent;
    }    
}

