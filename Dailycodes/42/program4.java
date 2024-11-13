
class Demo{
	int x= 10;
	Demo(int x){
		System.out.println("In constructor");
	}
	void fun(){
		System.out.println(x);
	}
	public static void main(String[] args){
		Demo Obj= new Demo(20);
		Obj.fun();
	}
}
