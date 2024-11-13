
class Parent {
	 int x=10;
	static void fun(){
		System.out.println("In fun-Parent");
	}
}
class Child extends Parent{
	 int x=20;
	static void fun(){
		System.out.println("in fun-child");
	}
}
class Client{
	public static void main(String[] args){
		Parent Obj1=new Parent();
		Obj1.fun();
		System.out.println(Obj1.x);
		Child Obj2=new Child();
		Obj2.fun();
		System.out.println(Obj2.x);
	
		Parent Obj3=new Child();
		Obj3.fun();
		System.out.println(Obj3.x);
	}
}
