
class Demo{
	int x= 10;
	Demo(){
		
		System.out.println("In no-args constructor");
	}
	Demo(int x){
		this(10);
		System.out.println("in para1 ");
	}
	Demo(int x, int y){
		System.out.println("in para2");
	}
	public static void main(String[] args){
		Demo Obj1= new Demo();
		Demo Obj2= new Demo(50);
		Demo Obj3= new Demo(20,30);
	}
}
		
