
class DefaultHandler{
	static void fun(int x, int y){
		System.out.println("Start fun");
		System.out.println(x/y);
		System.out.println("end fun");

	}
	public static void main(String[] args){
		int x=10;
		int y=0;

		System.out.println("Start in main");
		fun(x,y);
		System.out.println("End in main");
	}
}
