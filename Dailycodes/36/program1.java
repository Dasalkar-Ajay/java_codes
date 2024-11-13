
class xyz{
	 void fun(int x){
		System.out.println("In fun");
	}
}

class Demo{
	void run(float f){
		System.out.println("IN run");
	}
	public static void main(String[] args){
		xyz obj1= new xyz();
	      // 	obj2.run();

		Demo obj2= new Demo();
		obj1.fun(10);
	       	obj2.run(01.34f);
	}
}

