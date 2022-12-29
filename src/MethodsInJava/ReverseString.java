package MethodsInJava;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        String str = in.next();
        String r = "";
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            r = x +r;
        }
        System.out.println(r);

    }
}
