package InputOutput;

import java.util.Scanner;

public class Fibboo {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        fib(n);

    }
    static void fib(int n){
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int temp = a;
            a = a+b;
            b=temp;
            System.out.println(a);
        }
    }
}
