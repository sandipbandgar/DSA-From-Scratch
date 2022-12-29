package MethodsInJava;

import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        System.out.println("Permutation: "+permutation(n,r));
        System.out.println("Combination:  "+combination(n,r));

    }
    static double permutation(int n, int r){
        return  factor(n)/(factor(n-r));
    }
    static  double combination(int n, int r){
        return  factor(n)/(factor(n-r)*factor(r));
    }
    static double factor (int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact *i;
        }
        return fact;
    }
}
