package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {123,23,34,345,2,1,312,23,43,234,34423,2332,23,3434,34,3,2,32,};
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum range between two index: "+ maxRange(arr, in.nextInt(), in.nextInt()));
        System.out.println("Minimum range between two index: "+ minRange(arr, in.nextInt(), in.nextInt()));
        System.out.println("Maximum value in array: "+ min(arr));
        System.out.println("Minimum value in array: "+ max(arr));
    }

    static int maxRange(int[] arr, int r1, int r2){
        if ( r1 > r2){
            return Integer.MAX_VALUE;
        }
        if(r1 == r2){
            return -1;
        }
        int max = arr[r1];
        for (int i = r1; i <= r2 ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int minRange(int[] arr, int r1, int r2){
        if ( r1 > r2){
            return Integer.MIN_VALUE;
        }
        if(r1 == r2){
            return -1;
        }
        int min = arr[r1];
        for (int i = r1; i <= r2 ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    static int max (int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max= arr[i];
            }
        }
        return max;
    }
    static int min (int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

}
