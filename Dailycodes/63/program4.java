
class ThreadDemo extends Thread{
	public void run(){
	
		System.out.println("Hii ajay iam in the :"+Thread.currentThread());
	}
}

class client{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getPriority());
		ThreadDemo Obj=new ThreadDemo();
		Obj.start();	
		System.out.println("Hii ajay iam in the :"+Thread.currentThread());
	}
}
