package ConditionalsAndLoops;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("enter operation that you wanna do");
        char op = in.next().trim().charAt(0);
        if(op == '+'){
            System.out.println("Your addition is here: " + (num1+num2));
        } else if (op == '*') {
            System.out.println("your multiplication is here : "+ (num1 * num2));
        } else if(op == '-'){
            System.out.println("your subtraction in here: "+ (num1 - num2) );
        } else if (op == '/') {
            System.out.println("your division is here: "+ (num1 / num2));
        }else {
            System.out.println("please enter right operation");
        }
    }
}
