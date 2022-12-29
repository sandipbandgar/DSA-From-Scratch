package ConditionalsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char aB = in.next().trim().charAt(0);
        if ( aB >='a' && aB <='z') {
            System.out.println("LowerCase");

        }
        else if ( aB <= 'Z' && aB >='A'){
            System.out.println("UpperCase");
        }else {
            System.out.println("enter a correct char");
        }
    }
}
