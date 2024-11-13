
class ThreadDemo extends Thread{
	public void run(){
		for(int i=0;i<=15;i++){
			System.out.println(getName());
		}
	}
	public static void main(String[] args)throws Exception{
		ThreadDemo Obj=new ThreadDemo();
		Obj.start();
		for(int i=0;i<=15;i++){
			try{
			Thread.sleep(1);
			}catch (Exception e){};
			System.out.println(Thread.currentThread().getName());
		}

	}
}
