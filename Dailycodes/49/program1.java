
abstract class Parent {
	void career(){
		System.out.println("Software engineering");
	}
	void marry(){
		System.out.println("Alia Bhat");
	}
}
class child extends Parent{
	void marry(){
		System.out.println("Sammrudhii");
	}
}
class client {
	public static void main(String[] args){
		Parent obj=new child();
		obj.career();
		obj.marry();
	}
}
