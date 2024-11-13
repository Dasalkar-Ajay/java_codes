
class Demo{

	public static void main(String[] args){
		Demo Obj=new Demo(){
			{System.out.println("Demo in anonymous inner class ");}
		};
	}
}
