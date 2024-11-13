import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int size = sc.nextInt();

		int arr[] =new int[size];

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the number at index:"+i);

			arr[i]=sc.nextInt();
		}
		System.out.println("the sum of the total array is");
		
		int sum =0;
		for (int i=0;i<arr.length;i++){
			sum +=arr[i];
	}
	System.out.println(sum);
}
}
	
			
		
	

