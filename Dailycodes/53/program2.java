
interface Demo{
	void m1(){
		System.out.println("In m1 method");
	}
	void m2();
}

class Demochild implements Demo{
	public void m2(){
		System.out.println("IN Demochild-");
	}
}
