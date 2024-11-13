import java.io.*;

class DirList{
	public static void main(String[] args)throws IOException{
		File fObj=new File("./");
		fObj.list();
		String names[] =fObj.list();
		System.out.println(names.length);
		System.out.println(fObj.isDirectory());
		System.out.println(fObj.isFile());
	}
}
