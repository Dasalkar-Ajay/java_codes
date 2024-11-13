import java.io.*;
class Demo{
	public static void main (String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("ENter the yyour name");
		String str=br.readLine();

		System.out.println("Enter the socierty name");
		String str2=br.readLine();

		System.out.println("enter the char");
		char ch =(char)br.read();
		br.skip(2);

		System.out.println("Enter the your flatno:");
		int  flatno=Integer.parseInt(br.readLine());

	}
}
		
