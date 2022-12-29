package MethodsInJava;

import java.util.Scanner;

public class SumByMethod {
    public static void main(String[] args) {
        sum();
    }

     static void sum() {
         Scanner in = new Scanner(System.in);
         System.out.println("enter two Numbers");
         int a = in. nextInt();
         int b = in. nextInt();
         int sum = a+b;
         System.out.println("Here is your Addition: "+ sum);
    }
}
