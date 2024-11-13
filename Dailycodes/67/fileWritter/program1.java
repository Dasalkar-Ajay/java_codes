import java.io.*;

class FileWrite{
	public static void main(String[] args)throws IOException{
		FileWriter Obj=new FileWriter("ajay.txt");
		Obj.write("ajay");
		Obj.write("hii");
		Obj.write("Dasalkar");
		Obj.write("lvdya");
		Obj.close();
	}
}
