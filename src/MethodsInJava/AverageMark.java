package MethodsInJava;

import java.util.Scanner;

public class AverageMark {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(average(arr));
    }
    static float average(int[] arr){
        int i;
        int sum = 0;
        for (i = 0; i < arr.length; i++) {
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
            sum = sum+arr[i];
        }
        return (float) sum/i;
    }
}
