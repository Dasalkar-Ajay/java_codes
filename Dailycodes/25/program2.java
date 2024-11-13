import java.util.*;

class Demoo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of (size )of an arrey");
		int sizearr=sc.nextInt();

		int arr[] =new int[sizearr];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
