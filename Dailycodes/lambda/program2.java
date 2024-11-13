interface Demo {
	
	void m1 (int x,int y);
}
class outer {
	public static void main(String [] args ){

		Demo obj = (int x,int y)->{

			System.out.println("in anonymous inner class of the not paramitrized");
		};
		obj.m1(19,23);
	}
}
