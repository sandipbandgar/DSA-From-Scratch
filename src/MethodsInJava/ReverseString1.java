package MethodsInJava;

import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String n = in.next();
        System.out.println(reverse(n));
    }
    static String reverse(String a){
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            b = c + b;
        }
        return b;
    }
}
