import java.io.*;

class Demo{
	void fun(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		System.out.println(str);
		try{
			br.close();
			str=br.readLine();
		}catch(Exception e){
			System.out.println(e);
			System.out.println("hii");
		}
		//br.close();
		System.out.println(str);

	}
	public static void main(String[] args){
		Demo Obj=new Demo();
		Obj.fun();
		
	}
}
