
import java.io.*;

class OwnException{
	public static void main(String[] args){
		System.out.println("Start main");
		try{
			System.out.println(10/0);
		}catch(Exception E){
			System.out.println(E+"\n");

			System.out.println(E.getMessage());

			E.printStackTrace();
		}

		System.out.println("End the code\n");

		System.out.println(10/0);
	}
}
