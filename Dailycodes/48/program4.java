class Outer{
    static{
        gun();
    System.out.println("in static block ");
    }

    static class Inner{
        void fun(){
            System.out.println("In fun");
            gun();
        }
    }
    static void gun(){
        System.out.println("in gun");
    }

}

class code{
    public static void main(String[] args) {
       
        new Outer.Inner().fun();
    }
}
