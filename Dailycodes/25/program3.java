import java.util.*;

class Demoo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of (size )of an arrey");
		int sizearr=sc.nextInt();

		String arr[] =new String[sizearr];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextLine();
		}
		//System.out.println("Enter the elements");
		//

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		
		}

		System.out.println(arr);
	}
}
