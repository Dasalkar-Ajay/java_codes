
class Demo extends Thread{
	Demo(String str){
		super(str);
	}
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}

class client{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName());
		Demo Obj=new Demo("Ajay");
		Obj.start();
		System.out.println(Obj.getName());
	}
}
