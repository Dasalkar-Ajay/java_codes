
class Outer{
	static int x= 10;
	static void run(){
		System.out.println("In static method");
	}
	class Inner{
		int y=20;
		void fun(){
			System.out.println("In fun Inner class");
			System.out.println(x);
		run();
		}
	}
	public static void main(String[] args){
		Outer outObj= new Outer();
		Inner Obj= outObj.new Inner();
		Obj.fun();
	}
}
