class method {
	static void fun(){
		System.out.println("in fun");
	}
}
class child extends method {
}

class client {
	public static void main(String [] args ){
		child obj = new child();
		obj.fun();
	}
}
