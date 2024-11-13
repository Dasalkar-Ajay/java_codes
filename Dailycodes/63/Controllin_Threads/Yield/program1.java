
class ThreadDemo extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("in run");
		}
	}
}
class client{
	public static void main(String[] args){
		ThreadDemo Obj=new ThreadDemo();
		Obj.start();
		Thread.yield();
		for(int i=0;i<=10;i++){
			System.out.println("in main");
		}
	}
}
