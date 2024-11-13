
class ThreadDemo extends Thread{
	
	 public void run(){
		 System.out.println("in the run");
		 System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args)throws InterruptedException{
		System.out.println("Start Main");
		System.out.println(Thread.currentThread().getName());
		ThreadDemo Obj=new ThreadDemo();
		Obj.start();
		System.out.println(Thread.currentThread().getName());
	}
}
