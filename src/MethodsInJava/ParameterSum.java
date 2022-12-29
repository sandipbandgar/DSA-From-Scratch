package MethodsInJava;

import java.util.Scanner;

public class ParameterSum {
    public static void main(String[] args) {
        int ans = sum(10,20);
        System.out.println(ans);
    }

//    Pass the value of number when your calling the method in main function
    static int sum(int a, int b) {
        int sum = a+b;
        return sum;
    }
}
