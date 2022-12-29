package MethodsInJava;

import java.util.Objects;
import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(palindrome(str));

    }
    static boolean palindrome(String a){
        return a.equals(reverse(a));
    }
    static String reverse(String a){
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            b = x + b;
        }
        return b;
    }
}
