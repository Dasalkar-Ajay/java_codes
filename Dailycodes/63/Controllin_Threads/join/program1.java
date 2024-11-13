class code extends Thread{
  public void run(){
          for(int i=0;i<=15;i++){
		  try{
			  Thread.sleep(1000);
                  System.out.println(getName());
		  }catch (Exception e){
		  }
          }
  }
  public static void main(String[] args)throws InterruptedException{
          code Obj=new code();
          Obj.start();
       Thread.currentThread().join();
          for(int i=0;i<=15;i++){
                  System.out.println(Thread.currentThread().getName());
          }

  }
}
