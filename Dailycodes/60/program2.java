
class ThreadDemo{
	static void fun()throws InterruptedException{
		for(int i=0;i<5;i++){
			System.out.println("in fun");
			Thread.sleep(1200);
		}
	}
	public static void main(String[] args)throws InterruptedException{
		System.out.println("Start Main");
		fun();
		System.out.println("End Main");
	}
}

