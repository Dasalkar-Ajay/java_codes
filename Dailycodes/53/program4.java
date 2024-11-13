
class Demo{
	void fun(){
		System.out.println("In fun-Demo");
	}
}
class Outer{
	public static void main(String[] args){
		Outer Obj=new Demo(){
			void fun(){
				System.out.println("In Outer$1");
		
			}
		};

			Obj.fun();
	}
}

