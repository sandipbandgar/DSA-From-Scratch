package MethodsInJava;

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float r = in.nextFloat();
        float t = in.nextFloat();
        double value = interest(a,r,t);
        System.out.println("interest: "+ Math.round(value));
        System.out.println("total Amount including interest: "+ Math.round(a + value));
    }
    static double interest(float a, float r, float t){
        return a * Math.pow((1+r/100),t);
    }
}
