package MethodsInJava;

import java.util.Scanner;

public class BetweenPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        for (int i = start; i < end; i++) {
            if (prime(i)){
                System.out.print(i + " ");
            }
        }

    }
    static boolean prime(int n){
        if(n <=1){
            return false;
        }
        int x =2;
        while (x*x < n){
            if (n%x==0){
                return false;
            }
            x++;
        }
        return x*x > n;
    }
}
