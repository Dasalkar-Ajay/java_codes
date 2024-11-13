class Demo{
	void fun(int f){
		System.out.println("In fun");
	}

	public static void main(String[] args){
		Demo obj= new Demo();
		obj.fun(10);
		//obj.fun(10L);

		float x= 33L;
	}
}
