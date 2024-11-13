class Demo{
	void fun(char x, char y){
		System.out.println("In fun");
		System.out.println(x);
		System.out.println(y);
	}

	void run(double a,float b){

		System.out.println("In run");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args){
		Demo obj= new Demo();
		obj.fun('A','B');
		//obj.fun(6,3  );
	//	obj.fun(66,65  );
		
		
		obj.run('r','d'  );
		obj.run(  10,20);
		//obj.run(  10.4,20.4);
		obj.run(  10f,49f);
		/*obj.run(  );
		obj.run(  );
		obj.run(  );*/
	}
}
