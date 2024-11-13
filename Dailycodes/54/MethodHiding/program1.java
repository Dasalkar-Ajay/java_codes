
class Parent{
	static void fun(){
		System.out.println("in Parents fun");
	}
}
class Child extends Parent{
	static void fun(){
		System.out.println("in Childs fun");
	}
}
class Client{
	public static void main(String[] args){
//		Parent Obj=new Parent();
	//	Child Obj=new Child();
		Parent Obj=new Child();
		
		Obj.fun();
	}
}

