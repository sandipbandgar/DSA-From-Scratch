package MethodsInJava;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean oddN = odd(n);
        System.out.println("True means even & False means odd,\n ans is: "+oddN);
    }

    static boolean odd(int n) {
        if(n%2==0){
            return true;
        }
             return false;
    }
}
