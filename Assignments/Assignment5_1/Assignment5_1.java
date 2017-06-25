import java.util.*;

public class Assignment5_1{
	public static void main(String args[]){
		while(true){
			Scanner scn=new Scanner(System.in);
			String str=scn.nextLine();

			String[] a=str.split(",");
			
			int min=Integer.valueOf(a[0]);
			int max=Integer.valueOf(a[1]);

			int[] prime=new int[max/2];
			prime[0]=1;
			prime[1]=2;
			
			int n=2;
			boolean check=false;
			for(int i=3; i<=max; i++){
				check=false;
				for(int j=1; j<n; j++){
					if(i%prime[j]==0){
						check=true;
						break;
					}
				}
				if(check==false) prime[n++]=i;
			}

			//=====================================================

			LinkedList<Integer> llist=new LinkedList<Integer>();
			for(int i=0; i<n; i++){
				if(prime[i]>=min) llist.add(prime[i]);
			}

			//=====================================================

			int d=0, sum=0;
			int ans=0, ans_max=0;
			for(int i=0; i<llist.size(); i++){
				for(int j=i+1; j<llist.size(); j++){
					ans=1;
					sum=llist.get(j);
					d=llist.get(j)-llist.get(i);
					while(llist.contains(sum)){
						ans++;
						sum+=d;
						if(ans>ans_max) ans_max=ans;
					}
				}
			}

			System.out.println(ans_max);
		}
	}
}
