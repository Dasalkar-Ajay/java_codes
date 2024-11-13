
class code extends Thread {
  public void run() {
    System.out.println(getName());
    // System.out.println(Thread.currentThread());
    // System.out.println(Thread.currentThread().getName());
    // System.out.println(getName());
  }
}

class client extends Thread {

  public static void main(String[] args) {
    code obj = new code();
    obj.run();
    // obj.start();
    // System.out.println(Thread.currentThread());
    // System.out.println(Thread.currentThread().getName());
    // System.out.println(obj.getName());

  }
}	

