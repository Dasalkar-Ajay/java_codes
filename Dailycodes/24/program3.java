import java.util.*;

class Demo{
	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);
	
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[] =new int[size];

		System.out.println("Size of array"+arr.length);

		for(int i=0;i<arr.length;i++){
		
			System.out.println("Enter the player j no"+i);
			arr[i] =sc.nextInt();

		}

		for (int i =0;i< arr.length;i++){
			System.out.println(arr[i]);
		}

	
	}
}
