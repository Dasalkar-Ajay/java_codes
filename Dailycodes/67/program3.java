import java.io.*;

class DirList{
	public static void main(String[] args)throws IOException{

		File fObj=new File("/homes/ajay/java/codes/Dailycodes/67");
		String names[] =fObj.list();
		System.out.println(names.length);
	}
}
