
class Outer {
	class Inner1{
		Inner1(){
			System.out.println("constructor Inner1");
		}
	class Inner2{
		Inner2(){
			System.out.println("constructor Inner2");
		}
	class Inner3{
		Inner3(){
			System.out.println("constructor Inner1");
		}
	}
	}
	}
	public static void main(String[] args){
		Outer OuterObj= new Outer();
		Inner1 Inner1Obj= OuterObj.new Inner1();
		Inner1.Inner2 Inner2Obj= Inner1Obj.new Inner2();
		Inner2.Inner3 Inner3Obj= Inner2Obj.new Inner3();
	}
}

