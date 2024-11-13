interface Parent1 {
    default void fun() {
        System.out.println("in interface");
    }
}

class Parent2 {
    void fun() {
        System.out.println("in parent2");
    }
}

class Demo extends Parent2 implements Parent1 {
    // If you don't override fun(), it will use the implementation from Parent2
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.fun(); // Calls the fun() method from Parent2

        Parent1 obj1 = new Demo();
        obj1.fun(); // Calls the fun() method from Parent1 due to default implementation
    }
}

