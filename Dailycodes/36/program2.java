
class xyz {
	void gun(){
		System.out.println("In gun");
	}
	void fun(int x){
		System.out.println("in fun");
	System.out.println(x);
	}
}

class Demo{
	void run(int i,float f){
		System.out.println("In run");
		System.out.println(i);
		System.out.println(f);
	}

  public static void main(String[] args) {
        xyz obj2 = new xyz();
        int y = 10;
        obj2.fun(y);
	obj2.gun();
  }
}
