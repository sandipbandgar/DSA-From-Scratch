package MethodsInJava;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("enter number of innings played");
        int numberI = in.nextInt();
        System.out.println("Enter Number of innings Not Out");
        int numberN = in.nextInt();
        System.out.println("Enter Number of Runs Scored");
        int runs = in.nextInt();
        System.out.println(average(numberI, numberN,runs));
    }
    static int average(int n1, int n2, int n3){
        int out = n1-n2;
        return (n3)/out;
    }
}
