
class Demo extends Thread{
	
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}

class client{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName());
		Demo Obj=new Demo();
		Obj.setName("Ram");
		Obj.start();
		System.out.println(Obj.getName());
	}
}
