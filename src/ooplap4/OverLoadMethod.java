package ooplap4;
//1. overload method
//2. overloading method
//3. method overload


public class OverLoadMethod {
    public static void A() {
        System.out.println("Hello A");
    }
    public static void A(int x){
        System.out.println("Hello A"+x);
    }
    public static void A(int x ,int y){
       System.out.println("Hello A"+(x+y));
    }
    public static void B(){
        System.out.println("Hello B");
    }


    public static  void main(String[] args){
        A();
        A(10);
        A(10,20);
        B();

    }//main
}//class
