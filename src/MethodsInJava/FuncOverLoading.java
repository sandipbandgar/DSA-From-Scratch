package MethodsInJava;

import java.util.Arrays;

public class FuncOverLoading {
    public static void main(String[] args) {
        fun("sandy",32); // this is known as function overLoading
       int sumDum = sum(5,5,5);
        System.out.println(sumDum);
//        var();  We cannot put it empty this is known as ambiguity
    }
    static void fun(int a , int b){
        System.out.println(a + " " +b);
    }
    static void fun(String a , int ...b){
        System.out.println(a + " " +b);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static void var(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void var(String ...a){
        System.out.println(Arrays.toString(a));
    }
}
