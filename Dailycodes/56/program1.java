import java.io.*;

class FileNotFoundDemo{
	public static void main(String[] args)throws IOException{
		File Fobj= new File("abc.txt");
		FileReader fr=new FileReader(Fobj);
		System.out.println(fr.read());
	}
}

