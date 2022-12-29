package InputOutput;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(prime(n));
        for (int i = 0; i < 1000; i++) {
            if(prime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean prime(int n){
        if (n <= 1){
            return false;
        }
        int x =2;
        while (x*x < n){
            if (n%x==0){
                return false;
            }
            x++;
        }
        return x*x > n;
    }
}
