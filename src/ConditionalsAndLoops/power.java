package ConditionalsAndLoops;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter base");
        int b = in.nextInt();
        System.out.println("enter your exponent");
        int e = in.nextInt();
        System.out.println(power2(b,e));
    }
    static double power2(int a, int b){
        return (Math.pow(a,b));
    }
}
