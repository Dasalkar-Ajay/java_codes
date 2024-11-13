
class Demo extends RuntimeException{
	Demo(String str){
		super(str);
		//System.out.pritnln("In men");

	}
}
class client {
	static void fun(){
		throw new Demo("hii");
	}
	public static void main(String[] args){
		fun();
	}
}
