package MethodsInJava;

import java.util.Scanner;

public class palindromeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(palindrome(a));
        for (int i = 0; i < 1000; i++) {
            if (palindrome(i)){
                System.out.println(i);
            }
        }
    }
    static boolean palindrome(int a){
        int x = a;
        int sum=0;
        while(a > 0){
            int l = a%10;
            a  = a/10;
            sum = sum*10+l;
        }
        return x == sum;
    }
}
