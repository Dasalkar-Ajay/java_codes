
import java.util.concurrent.*;

class ThreadTask implements Runnable{
	ThreadTask(int num){

		System.out.println(Thread.currentThread().getName());
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+"in run");
	 fun();
		System.out.println(Thread.currentThread().getName()+"in run");
	}
	void fun(){
		System.out.println(Thread.currentThread().getName()+"in fun");
	}
}

class Demo{
	public static void main(String[] args){
		ExecutorService Obj=Executors.newFixedThreadPool(3);
		//ThreadTask tsk=new ThreadTask(i);
		for(int i=0;i<=2;i++){
		ThreadTask tsk=new ThreadTask(i);
		Obj.execute(tsk);
		}
		Obj.shutdown();
	}
}
