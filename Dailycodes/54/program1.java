
class parent{
	private void fun(){
		System.out.println("In fun parent");
	}
}
class child extends parent{
	private void fun(){
		System.out.println("In fun child");
	}
}
class client{
	public static void main(String[] args){
		parent Obj=new child();
		Obj.fun();
	}
}
