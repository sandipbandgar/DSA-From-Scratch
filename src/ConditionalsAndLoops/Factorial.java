package ConditionalsAndLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int i,fact = 1;
        int number = in.nextInt();
        for( i=1; i<=number ; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
//        int i,fact=1;
//        int number= in.nextInt();//It is the number to calculate factorial
//        for(i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+number+" is: "+fact);
}
}
