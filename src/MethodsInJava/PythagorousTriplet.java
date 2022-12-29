package MethodsInJava;

import java.util.Scanner;

public class PythagorousTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in. nextInt();
        int b = in. nextInt();
        int c = in. nextInt();
        System.out.println(triplet(a,b,c));

    }
    static boolean triplet(int a,int b,int c){
        return (a * a) + (b * b) == c * c;
    }
}
