package MethodsInJava;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int a = in.nextInt();
        float r = in.nextFloat();
        float t = in.nextFloat();
        System.out.println(compound(a,r,t));
    }
    static float compound(int a, float r, double t){
        return (float) ((float) a*(Math.pow((1+r/100),t)));
    }

}
