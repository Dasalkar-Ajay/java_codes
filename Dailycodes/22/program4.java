import java.io.*;
import java.util.*;

class Demo{
	 public static void main(String[] args)throws IOException {

		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter your name:");
		 String name=br.readLine();
		 
		 System.out.println("Enter your Society name:");
		String societyname=br.readLine();

		 System.out.println("Enter your Wing:");
		char wing = (char)br.read(); 
		br.printl(0);
		//br.skip(1);
		 
		//System.out.println("Enter your flat no:");
		 int flatno=Integer.parseInt(br.readLine());
			
		 
		 System.out.println(" your name:"+name);
		 System.out.println(" your societyname:"+societyname);
		 System.out.println(" your name:"+wing);
		 System.out.println("your name:"+flatno);
	 }
}
