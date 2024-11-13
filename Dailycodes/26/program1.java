import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
 		int x=10;
		int y=20;
		int z=10;
		 
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
		//System.out.println(System.identityHashcode(x));
		
		z=11;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));

	}
}

