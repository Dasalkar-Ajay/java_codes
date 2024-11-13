import java.util.*;

class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name  ");
		String name=sc.nextLine();

		System.out.println("Enter the Society name");
		String societyName=sc.nextLine();

		System.out.println("Enter the wing");
		char wing =sc.next().charAt(0);
		
		System.out.println("Enter the flatno");
		int flatNo =sc.nextInt();


	        System.out.println("Your name: " + name);
                System.out.println("Your Society name: " + societyName);
                System.out.println("Your Wing: " + wing);
                System.out.println("Your flat number: " + flatNo);
	}
}
