
import java.util.concurrent.*;

class ThreadTask{

	int num=0;
	ThreadTask(int num){
		this.num=num;

		System.out.println(num+"in ThreadTask");
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+"Start-"+num);
	fun();
	System.out.println(Thread.currentThread().getName()+"end-Thread");
	}
	void fun(){
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){

		}
	}
}
class Demo{
	public static void main(String[] args){
		ExecutorService threadpool= Executors.newFixedThreadPool(5);
		//for(int i=0;i<=10;i++){
			ThreadTask task=new ThreadTask(3);
			threadpool.execute(task);
		//}
	
	}
}
