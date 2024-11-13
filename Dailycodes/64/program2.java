class ThreadDemo implements Runnable {
  public void run() {
    System.out.println("In run");
    System.out.println(Thread.currentThread().getName());
  }
}

class client {
  public static void main(String[] args) {
    ThreadDemo td = new ThreadDemo();
    Thread t1 = new Thread(td, "Ajay");
    t1.start();
  }
}
