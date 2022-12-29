package MethodsInJava;

import java.util.Scanner;

public class armstrongFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean arm = armstrong(n);
        System.out.println(arm);
        for (int i = 100; i <1000 ; i++) {
            if (armstrong(i)){
                System.out.println(i + "");
            }
        }
    }
    static boolean armstrong(int n){
        int orignal = n;
        int  sum = 0;
        while(n > 0){
            int x = n % 10;
            n = n/10;
            x = x*x*x;
            sum = sum+x;

        }
        return sum == orignal;
    }
}
