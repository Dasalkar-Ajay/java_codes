class One {
    int x = 10;
    static int y = 10;

    // Static block to initialize static context
    static {
        System.out.println("Static block in class One");
        System.out.println("Identity Hash Code of y: " + System.identityHashCode(y));
    }

    // Instance block to initialize instance context
    {
        System.out.println("Instance block in class One");
        System.out.println("Identity Hash Code of x: " + System.identityHashCode(x));
    }

    void fun() {
        System.out.println("In fun");
    }

    static void run() {
        System.out.println("In run");
    }

    public static void main(String[] args){
	    System.out.println("ajaj");
    }
}

class Two {
    public static void main(String[] args) {
        System.out.println("In main method");

        // Creating an instance of class One to see instance block output
        One obj = new One();
        obj.fun();
        One.run(); // Call static method using class name
    	void main(){
		System.out.println("Ahay");
	}
    }
}

