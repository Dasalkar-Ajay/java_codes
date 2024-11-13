
abstract class Demo{
        abstract void gun();
}
class client {
	public static void main(String[] args){

		Demo Obj=new Demo(){
			public void gun(){
				System.out.println("in gunn");
			}
		};

		// Obj.gun();
	}
}

