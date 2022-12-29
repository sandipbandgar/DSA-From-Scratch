package MethodsInJava;


import java.util.Scanner;

public class ReturnSum {
    public static void main(String[] args) {
        int ans =sum();
        System.out.println(ans);
    }

     static int sum() {
         Scanner in = new Scanner(System.in);
         System.out.println("enter two Numbers");
          int a = in. nextInt();
          int b = in. nextInt();
          int sum = a+b;
         System.out.println("Here is your Addition: "+ sum);
         return sum;
//         System.out.println("sandy f function is already over");
    }
}
