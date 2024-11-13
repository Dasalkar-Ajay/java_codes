
import java.io.*;

class FileWrite{
	public static void main(String[] args)throws IOException{
		FileWriter Obj=new FileWriter("ajay.txt",true);
		Obj.write("jay shree ram 2nd\n");
		Obj.write("jay shree ram 2nd");
		Obj.close();
	}
}
