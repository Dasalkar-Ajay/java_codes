import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);

                System.out.println("Enter your name:");
                String name = sc.nextLine();

                System.out.println("Enter your Society name:");
                String societyName = sc.nextLine();

                System.out.println("Enter your Wing (single character):");
                char wing = sc.next().charAt(0); // Read a single character
                // br.readLine(); // Consume the newline character left after reading the char

                System.out.println("Enter your flat no:");
                int flatNo =  sc.nextInt();

                System.out.println("Your name: " + name);
                System.out.println("Your Society name: " + societyName);
                System.out.println("Your Wing: " + wing);
                System.out.println("Your flat number: " + flatNo);

	}
}
