package ConditionalsAndLoops;

import java.util.Scanner;

public class commision {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("enter you sales");
        int sales = in.nextInt();
        System.out.println("enter your commission percentage");
        int percentage = in.nextInt();
        System.out.println(commission(sales,percentage));
    }
    static float commission(int a, int b ){
        return (float) (a/100*b);
    }
}
