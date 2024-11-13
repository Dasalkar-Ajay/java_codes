
class Demo{
	public static void main(String[] args){
		Runnable ref=new Runnable(){
			public void run(){
			System.out.println("hii");
			System.out.println(Thread.currentThread().getName());
			}
		};

		Thread obj=new Thread(ref);
		obj.start();
			System.out.println(Thread.currentThread().getName());

	}
}

