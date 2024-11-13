import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int arrsize=sc.nextInt();
		int arr[] =new int[arrsize];

		System.out.println("Enter the elemtents");

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();

		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
