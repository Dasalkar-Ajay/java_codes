class Demo{
	Demo(this,int x){
		System.out.println("In constructor");
		System.out.println(x);
		System.out.println(this);
	}

	public static void main(String[] args){
		Demo obj= new Demo(20);
		System.out.println(obj);
	}
}
