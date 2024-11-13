/*import java.util.concurrent.*;

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
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

public class PoolDemo22import java.util.concurrent.*;

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
        ; i <= 20; i++) {
            ThreadTask task = new ThreadTask(i);
            threadPool.execute(task); // Corrected method call
        }
        
        threadPool.shutdown(); // Shutdown the thread pool
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
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

public class PoolDemo22 {
    public static void main(String[] args) {
        int numberOfTasks = 20;
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i <= numberOfTasks; i++) {
            ThreadTask task = new ThreadTask(i);
            threadPool.execute(task); // Submit task asynchronously
        }

        threadPool.shutdown(); // Shutdown the thread pool
    }
}

