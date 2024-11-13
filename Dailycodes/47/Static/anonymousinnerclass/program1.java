
class Demo{
	void fun(){
		System.out.println("In fun");
	}
}
class Outer{
	public static void main(String[] args){
		Demo Obj= new Demo(){
		System.out.println("in the anonymous inner class");

		};
	}
}
