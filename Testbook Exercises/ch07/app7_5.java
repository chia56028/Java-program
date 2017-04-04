//app7_5
public class app7_5{
	public static void main(String agrs[]){
		int score[]={9, 14, 6, 18, 2, 10};
		largest(score);
	}

	public static void largest(int arr[]){
		int max=arr[0];
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("largest num = "+max);

	}
}