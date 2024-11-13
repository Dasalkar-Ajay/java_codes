interface parent1{
	default void fun(){
		System.out.println("in interface");
	}
}

class parent2{
   public 	void fun(){
		System.out.println("in parent2");
	}
}


class Demo   extends parent2 implements parent1 { 
	public static void main(String[] args){
		parent1 obj1= new Demo();
		 obj1.fun();
	}
}
