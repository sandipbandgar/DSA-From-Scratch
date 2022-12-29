package MethodsInJava;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(12,3,43,45,65,65,76,76,432);//Variable Length Argument
        multiple(32,23,"sandy", "abhi", "harry","vk","rushi");
    }
    static void multiple(int x, int y, String ...a){
        System.out.println(x + " " + y +" " + Arrays.toString(a));
    }
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
