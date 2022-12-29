package ConditionalsAndLoops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       int rev= 0;
        while(n > 0){
           int a = n%10;
            n = n/10;
            rev = a;
            System.out.print(rev);
        }

    }
}
