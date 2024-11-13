
class ThreadDemo extends Thread{
	ThreadDemo(ThreadGroup td,String str){
		super(td,str);
	}
	public void run(){
	 System.out.println(Thread.currentThread());
	}
}
class client {
	public static void main(String[] args){
		System.out.println(Thread.currentThread());
		ThreadGroup tg=new ThreadGroup("propulsion");
		
		ThreadDemo td=new ThreadDemo(tg,"ajay");
		td.start();
		//ThreadGroup tg=new ThreadGroup(td,"propulsion");
		


	}
}
