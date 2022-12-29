package MethodsInJava;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter two number that you want to swap");
        int x = in.nextInt();
        int y = in.nextInt();
         swap(x,y);
        System.out.println(x + " " + y);
    }
//    it won't able to Swap values
    static void swap(int a, int b){
        int temp = a;
        a =b;
        b = temp;
    }
}
