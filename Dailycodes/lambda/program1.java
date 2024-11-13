interface Demo{
	void main();
}
class outer {
	public static void main(String [] args ){
		Demo obj=()->{
			System.out.println("in ananymous inner class ");
		};
		obj.main();}
}
