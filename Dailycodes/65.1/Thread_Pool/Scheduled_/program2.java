
import java.util.concurrent.*;

class ThreadTask implements Runnable{
	int num=0;
	ThreadTask(int num){
	System.out.println(Thread.currentThread().getName());
	}
	public void run(){
	System.out.println("in run"+Thread.currentThread().getName());
	fun();
	}
	void fun(){

	System.out.println(Thread.currentThread().getName());
	}
}
class Demo{
	public static void main(String[] args){
		ExecutorService threadPool=Executors.newCachedThreadPool();
		for(int i=0;i<=5;i++){
			ThreadTask tsk=new ThreadTask(i);
			threadPool.execute(tsk);
		}
		threadPool.shutdown();
	}
}

