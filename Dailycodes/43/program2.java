
class Parent{
	void fun(){
		System.out.println("S f P");
	}
	void run(){
		System.out.println("S r P");
	}
}
class Child{
	 
	void fun(){
		System.out.println("S f P");
	}
	void run(){
		System.out.println("S r P");
	}
	void mun(){
		System.out.println("S m P");
	}
}
class Client {
	public static void main(String[] args){
		Parent p= new Parent();
		p.fun();
		p.run();

		Child c= new Child();
		c.fun();
		c.run();
		c.mun();

		Parent pc= new  Child();
		pc.fun();
		pc.run();
		pc.mun();

	}
}
