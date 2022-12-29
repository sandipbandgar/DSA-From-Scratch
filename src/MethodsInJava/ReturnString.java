package MethodsInJava;

import java.util.Scanner;

public class ReturnString {
    public static void main(String[] args) {
        String ReturnedName =nameGreet("Gfcct");
        System.out.println("Welcome to "+ ReturnedName);

    }
    static String nameGreet(String clg){
        Scanner in =  new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello Mr: "+ name);
        clg = "Gfcct";
        return clg;
    }
}
