
class ThreadDemo extends Thread{

	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName());
		ThreadDemo Obj=new ThreadDemo();
		Obj.start();
		System.out.println(Thread.currentThread().getName());
	}
}

