package ConditionalsAndLoops;

import java.util.Scanner;

public class UntilXcalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("enter operation that you wanna do or press X for exit");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("enter two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
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
            if (op == 'x' || op == 'X'){
                break;
            }
        }
    }
}
