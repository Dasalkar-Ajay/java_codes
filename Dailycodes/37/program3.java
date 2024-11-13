
class Demo{
	Demo(int x){
	System.out.println("In constructor");
	}
	
	void fun(){
		System.out.println("In fun method");
	}
}

class ConstrDemo{
	public static void main(String[] args){
		System.out.println("Start Main");
		Demo obj= new Demo(1);
		System.out.println("End Mainl");
	}
}

