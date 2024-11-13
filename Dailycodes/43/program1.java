class Parent{
	void fun(){

		System.out.println("In fun-Parent");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("In fun'Child");
	}
	void run(){
		System.out.println("In run-Child");
	}
	public static void main(String [] args){
		Parent Obj1= new Parent();
		Obj1.fun();
	}
}
