package ConditionalsAndLoops;

import java.util.Scanner;

public class depreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter value");
        int v1 = in.nextInt();
        System.out.println("enter rate%");
        float r = in.nextFloat();
        System.out.println("enter time");
        int t = in.nextInt();
        System.out.println(Math.round(dep(v1,r,t)));
    }
    static double dep(int v1, float r, int t){
        return (float) v1*(Math.pow(1-r/100,t));
    }
}
