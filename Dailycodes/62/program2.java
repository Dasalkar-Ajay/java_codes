
class Demo extends Thread{
	public void run(){
		System.out.println("in run"+ Thread.currentThread().getName());
	}
	public static void main(String[] args){
		Demo Obj=new Demo();
		Obj.start();
		System.out.println("in main"+ Thread.currentThread().getName());
	}
}
