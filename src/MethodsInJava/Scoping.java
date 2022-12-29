package MethodsInJava;

public class Scoping {
    public static void main(String[] args) {
            int a = 10;
            int b =20;
            scope(55);
        System.out.println("main func. a: " +a);
        System.out.println("main func. b: " +b);
//          Block Scoping
        {
//            you cannot initialize variable in block scope
//            int a = 10;
//            you can modify this
               a = 30;
               b = 99;
               int c = 44;
            System.out.println("Inside Block a: "+a);
            System.out.println("Inside Block b: "+b);
            System.out.println("Inside Block c: "+c);
        }
        int c = 94;
        System.out.println("main func. c: "+c);
//        you cannot access the variable that you declared in block scope
//        System.out.println(c);
    }
//    Function Scope
    static void scope(int b){
        int a = 100;
        System.out.println(a + " "+ b);
    }

}
