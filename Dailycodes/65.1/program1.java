
class ThreadDemo implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class client{
	public static void main(String[] args ){
		ThreadDemo Obj=new ThreadDemo();
		Thread t1=new Thread(Obj);
		t1.start();
	}
}
