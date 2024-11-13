class Demoone{

	int x= 10;
	int y= 20;

	void fun(){
		System.out.println("In fun");
	}
	void fun(){
		System.out.println("In run");
	}
}

class DemoTwo{

	public static void main(String[] args){
		System.out.println(x);
		System.out.println(y);
		fun();
		run();
	}
}
