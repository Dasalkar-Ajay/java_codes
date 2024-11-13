
class Demo extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args){
		System.out.println("Start Main");
		Demo Obj=new Demo();
		Obj.start();

		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}}
