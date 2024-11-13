
class ThreadDemo extends Thread{
	public void run(){
		System.out.println(getPriority());
		System.out.println(Thread.currentThread().getPriority());
	}
}

class client{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getPriority());
		ThreadDemo Obj=new ThreadDemo();
		System.out.println(Obj.getPriority());
		Obj.start();
			Obj.setPriority(10);
		System.out.println(Obj.getPriority());
			
	}
}
