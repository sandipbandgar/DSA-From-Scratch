package MethodsInJava;

public class shadowing {
    static int x = 100; //this will be shadowed by main fun x.
    public static void main(String[] args) {
        System.out.println(x); //100
        int x = 50; // this i
        System.out.println(x); // 50
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
