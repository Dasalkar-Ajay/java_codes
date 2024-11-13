
class Demo{
	Demo(){
		System.out.println("In Demo");
	}
	public void finalize(){
		System.out.println("in the demon thread");
	}
}
class client{
		
	static void fun(){
		Demo Obj1=new Demo();
		Demo Obj2=new Demo();
	}
	public static void main(String[] args)throws InterruptedException {
		
		System.out.println("Start Main");
		fun();
		Thread.sleep(3000);
		System.out.println("End Main");
	}
}

