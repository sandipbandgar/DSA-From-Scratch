package MethodsInJava;

import java.util.Scanner;

public class VoteMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean vote = age(n);
        System.out.println(" is i am eligible: "+ vote);
    }

     static boolean age(int n) {
        if (n >= 18){
            return true;
        }
        return false;
    }
}
