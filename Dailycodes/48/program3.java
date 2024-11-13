
class Demo{
	void fun(){
		System.out.println("In fun-Demo");
	}
	void run(){
		System.out.println("In run-Demo");
	}
}

class Outer{
	public static void main(String[] args){
		Demo Obj=new DemoAjay(){
		};
		Obj.fun();
		Obj.run();
	}
}
