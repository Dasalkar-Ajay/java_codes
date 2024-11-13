class parent {
	static void fun (){
		System.out.println("ini fun method");
	} 
}

class child extends parent {
	static void fun(){
		
		System.out.println("ini fun method of the child method ");
	}
}

class client {
	public static void main(String [] args ){
		parent obj1=new parent ();
		obj1.fun();

		child obj2 =new child ();
		obj2.fun();

		parent obj3= new child();
		obj3.fun();
	}
}
