
import java.util.concurrent.*;
class ThreadTask implements Runnable{


	public void run(){
		System.our.println(Thread.currentThread().getName());
		fun();
	}
	void fun(){
		System.out.println(Thread.currentThread().getName());
	}
}
class Demo{
	public static void main(String[] args){
		ThreadPoolExecutor tpl=(ThreadPoolExecutor)Executors.newCachedThreadPool();

		ThreadTask tsk=new ThreadTask();
		tpl.execute(tsk);
		threadPool.shutdown();

	}
}
