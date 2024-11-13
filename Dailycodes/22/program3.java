import java.io.*;
import java.util.*;

class Demo{
	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your name:");
		String str = br.readLine();

		System.out.println("enter your society name:");
		String str2 = br.readLine();

		
		System.out.println("Enter your wing :");
		char str3 =(char)br.read();

		System.out.println("My name is:"+str);
		System.out.println("My society is:"+str2);
		System.out.println("My wing is:"+str3);
	//	System.out.println("My name is:");






	}
}
