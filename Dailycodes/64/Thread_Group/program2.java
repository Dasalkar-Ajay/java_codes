class ThreadDemo extends Thread {
  ThreadDemo(ThreadGroup t, String str) {
    super(t, str);
  }

  public void run() {
    System.out.println(Thread.currentThread() + " thread group \n" + Thread.currentThread().getThreadGroup()
        + "parent Thread\n" + Thread.currentThread().getThreadGroup().getParent());
    System.out.println();
  }
}

class code {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread());
    System.out.println(Thread.currentThread() + " thread group \n" + Thread.currentThread().getThreadGroup()
        + "parent Thread\n" + Thread.currentThread().getThreadGroup().getParent());

    ThreadGroup tg = new ThreadGroup("Rocketry:");
    System.out.println(tg.getParent());

    ThreadGroup tg1_1 = new ThreadGroup(tg, "propulsion");
    ThreadGroup tg1_2 = new ThreadGroup(tg, "Avionics");

    ThreadDemo td = new ThreadDemo(tg1_1, "lankesh");
    ThreadDemo td2 = new ThreadDemo(tg1_1, "chrag");

    ThreadDemo td3 = new ThreadDemo(tg1_1, "ajay");
    ThreadDemo td4 = new ThreadDemo(tg1_1, "kuldeep");

    td.start();
    td4.start();
    td2.start();
    td3.start();
  }
}
