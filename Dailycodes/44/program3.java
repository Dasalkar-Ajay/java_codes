
class Outer {
	class Inner{
		Inner(){
			System.out.println("IN Inner Constructor");
		}
	}
		public static void main(String[] args){
		//	Outer Obj1= new Outer();
		//	Inner Obj2= Obj1.new Inner();
			Inner Obj= new Outer().new Inner();
		
	}
}
