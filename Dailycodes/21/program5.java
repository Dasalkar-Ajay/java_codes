import java.io.*;

class Demo{
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		String name = br.readLine();
		System.out.println("name:"+name);
		br.close();

		String cname = br.readLine();
		System.out.println("cname:"+cname);

//		br.close();
	}
}
	

