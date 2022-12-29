package MethodsInJava;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = in.nextInt();
        System.out.println(hcf(n, b));
        System.out.println(lcm(n,b));
    }
    static int lcm(int a, int b){
        return (a*b)/hcf(a,b);
    }
    static int hcf(int a, int b){
        int hcf = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }
}