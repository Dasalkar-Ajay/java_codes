
class Demo{
	int x= 10;
	Demo(){
		this(20);
		System.out.println("Constructor Demo-1");
		System.out.println(x);
//		this(20);
	}
	Demo(int x){
		System.out.println("Constructor Demo-2");
		System.out.println(x);
	}
	public static void main(String[] args){

		Demo Obj= new Demo();
		}
}
