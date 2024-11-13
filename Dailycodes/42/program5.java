

class Demo{
	int x=0;
	Demo(int x){
		this.x= x;
		System.out.println("In constructor");
	}
	void fun(){
		System.out.println(x);
	}
	public static void main(String[] args){
		Demo Obj1= new Demo(120);
		Demo Obj2= new Demo(150);
		Obj1.fun();
		Obj2.fun();
	}
}
