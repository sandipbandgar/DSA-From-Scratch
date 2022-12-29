package MethodsInJava;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n number");
        int[] arr = new int[in.nextInt()];
        System.out.println(sum(arr));
    }
    static int sum (int[] arr){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            sum = sum + arr[i];
        }
        return sum;
    }
}
