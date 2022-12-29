package MethodsInJava;

import java.util.Arrays;
import java.util.Scanner;

public class NewArm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {21,343,121,23,455,151,12321,233,34};
        cArm(arr);
    }
    static void cArm(int[] arr){
            int  i =0;
            while(i < arr.length){
                if (arms(arr[i])){
                    System.out.println(arr[i]);
                }
                i++;
            }
    }
    static boolean arms(int n){
        int x = n;
        int sum=0;
        while (n > 0){
            int t = n%10;
            n = n /10;
            sum = sum * 10 + t;
        }
        return sum == x;
    }
}
