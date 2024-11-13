
class Demo{
	void fun(){
		System.out.println("IN Fun");
	}
}

class DemoChild extends Demo{
	void fun(){
		System.out.println("in fun child");
	}
}

class Outer{
	public static void main(String[] args){
		Demo Obj1= new Demo();
		Obj1.fun();
		DemoChild Obj2= new DemoChild();
		Obj2.fun();
		Demo Obj3= new DemoChild();
		Obj3.fun();

		Demo Obj  = new DemoChild(){};
		Obj.fun();

	}
}
