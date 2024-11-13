
class Outer {
	void fun(){
		System.out.println("In fun");
	}
	class Inner{
		Inner(){
			System.out.println("constructor inner");
		}
	}
	public static void main(String[] args){
		Outer Obj= new Outer();
		Obj.fun();
	}
}
