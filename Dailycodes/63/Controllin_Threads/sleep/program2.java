
class ThreadDemo extends Thread{
	public void run(){
		for(int i=0;i<=15;i++){
			try{
				Thread.sleep(500);
				System.out.println(getName());
			}catch(InterruptedException e){};

		}
	}
	public static void main(String[] args){
		ThreadDemo Obj=new ThreadDemo();
		Obj.start();
		for(int i=0;i<=15;i++){
			try{
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName());
			}catch(InterruptedException e){};

		}
	}
}


