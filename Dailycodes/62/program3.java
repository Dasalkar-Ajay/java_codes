
class Threadsleep extends Thread{

	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args)throws InterruptedException{

		Threadsleep Obj=new Threadsleep();
		Obj.start();
		for(int i=0;i<=10;i++){
			Thread.sleep(1);
			System.out.println(Thread.currentThread().getName());
		}
	}
}
