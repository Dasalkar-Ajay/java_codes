
class Demo{
	Demo(){
		System.out.println("Demo constructor");
	}
	void fun(){
		System.out.println("in fun");
	}
	public void finalize(){
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getPriority());
	}
}
class client {
	public static void main(String[] args)throws InterruptedException{
		System.out.println("in main");
		Demo Obj=new Demo();
		Obj.fun();
		Obj=null;
		System.gc();
		Thread.sleep(10);
		System.out.println("in End");
	}
}
