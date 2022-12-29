package MethodsInJava;

import java.util.Scanner;

public class ReturnString2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String name = in.next();
        System.out.println("enter your College name");
        String clg = in.next();
        String message = greet(name, clg);
        System.out.println(message);

    }
    static String greet(String name, String clg){
        String greeting = "Hello mr: " + name +" Welcome to the "+ clg;
        return greeting;
    }
}
