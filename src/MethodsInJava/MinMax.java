package MethodsInJava;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int maxN = max(a,b,c);

        int minN = min(a,b,c);

        System.out.println(" Maximum Number: " + maxN);

        System.out.println(" Minimum Number: " + minN);

    }
    static int max(int a, int b, int c){
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }
    static int min (int a, int b, int c){
        int min = a;
        if (b < min){
            min = b;
        }
        if(c < min ){
            min = c;
        }
        return min;
    }
}
