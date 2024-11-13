import java.io.*;
class FileDemo2{
	public static void main(String[] args)throws IOException{
		File Obj=new File("aj.txt");
		
		File fObj=new File(Obj,"Core2Web.txt");
		fObj.createNewFile();
	}
}


