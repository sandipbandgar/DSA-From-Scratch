package MethodsInJava;

import java.util.Scanner;

public class Speech {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().trim().charAt(0);
    }
    static void check(char a){
        if (a == 'a' || a == 'i' || a == 'o'|| a == 'e' || a == 'u' ){
            System.out.println(a + " is a Vowel");
        }else {
            System.out.println(a + " is a Consonant");
        }
    }
}
