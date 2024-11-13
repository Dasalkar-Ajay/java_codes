
class Outer{
	static int x= 10;
	int y=20;
	static void run(){
		System.out.println("In static method run");
	}
	void fun(){
		System.out.println("In static method fun");
	}

	static class Inner{
		int z= 30;
		Inner(){
			System.out.println("IN the inner class which is a static class ");
			System.out.println(x);
			//System.out.println(y);
			run();
			//fun();
		}
	}
}

class Client{
	public static void main(String[] args){

		//Outer.Inner Obj=new Outer.Inner();
		//System.out.println(Obj.z);

		Outer OutObj= new Outer();
		OutObj.fun();

		Inner Obj=  OutObj.Inner();

	}
}
			
