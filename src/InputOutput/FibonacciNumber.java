package InputOutput;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int x = 0;
        while(x <= n){
            int temp = a;
             a = a+b;
             b = temp;
            x++;
            System.out.println(b);
        }
    }
}
