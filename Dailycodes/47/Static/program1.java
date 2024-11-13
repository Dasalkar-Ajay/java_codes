
class Outer{
	static int x= 10;
	int y=20;
	static void run(){
		System.out.println("In static method run");
	}
/*	void fun(){
		System.out.println("In static method fun");
	}

*/	static class Inner{
		Inner(){
			System.out.println("IN the inner class which is a static class ");
			System.out.println(x);
			//System.out.println(y);
			run();
			//fun();
		}
	}
	public static void main(String[] args){
		Inner Obj= new Inner();
	}
}
			
