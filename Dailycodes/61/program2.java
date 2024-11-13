
class Runner extends Thread{
	public void run(){

		for(int i=0;i<=15;i++){

				System.out.println(Thread.currentThread().getName());
		}
	}
}
class r{
	public static void main(String[] args){
		
	Runner Obj=new Runner();
		Obj.start();	
			for(int j=0;j<=15;j++)
			{
				System.out.println(Thread.currentThread().getName());
		}
	
	}
}
