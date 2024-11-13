
interface Demo{
	void m1();
	void m2();
}

class Outer{
	public static void main(String[] args){
		Demo Obj=()-> {
			System.out.println("in the lamda function");
		};
		Obj.m1();
		Obj.m2();
	}
}
