package MethodsInJava;

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(factor(a));
        System.out.println(perfect(a));
        for (int i = 1; i < 10000 ; i++) {
            if (perfect(i)){
                System.out.println(i);
            }
        }

    }
    static boolean perfect(int a){
        return a == factor(a);
    }
    static int factor(int a){
        int f = 0;
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
