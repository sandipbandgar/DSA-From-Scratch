package ConditionalsAndLoops;

import java.util.Scanner;

public class NumberChecking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number:");
        int n = in.nextInt();
        System.out.println("enter which number you want to check:");
        int num = in.nextInt();
        int count =0;
        while(n > 0){
            int a = n%10;
            n = n/10;
            if(a==num){
                count++;
            }
        }
        System.out.println(count);
    }
}
