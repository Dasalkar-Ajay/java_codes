import java.io.*;

class Demo{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);

		BufferedReader br= new BufferedReader(isr);
		
		String str=br.readLine();
		System.out.println("name:"+str);

//		br.close();

		String clg=br.readLine();
		System.out.println("collage"+clg);
	}
}






