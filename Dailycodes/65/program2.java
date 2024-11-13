/*import java.util.concurrent.*;

class ThreadTask implements Runnable{
	int num=0;
	ThreadTask(int num){
		this.num=num;
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+"Start code "+num);
		 fun();
		System.out.println(Thread.currentThread().getName()+"End code"+num);
	}
	void fun(){
		try{
			Thread.sleep(100);
		}catch (InterruptedException ie){
		}
	}
}
class poolDemo{
	public static void main (String [] args){

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		ExecutorService ThreadPool = Executors.new FixedThreadpool(10);
		for(int i=0;i<=20;i++){
			ThreadTask task = new ThreadTask(i);

			poolDemo.execute(task);
		}
	}
}*/
import java.util.concurrent.*;

class ThreadTask implements Runnable {
    int num;

    ThreadTask(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start code " + num);
        fun();
        System.out.println(Thread.currentThread().getName() + " End code " + num);
    }

    void fun() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

 class PoolDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); // Print current thread name
        ExecutorService threadPool = Executors.newFixedThreadPool(10); // Corrected method name

        for (int i = 0; i <= 20; i++) {
            ThreadTask task = new ThreadTask(i);
            threadPool.execute(task); // Corrected method call
        }

        threadPool.shutdown(); // Shutdown the thread pool
    }
}

