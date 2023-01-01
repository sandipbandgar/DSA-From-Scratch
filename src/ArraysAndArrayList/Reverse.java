package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        r(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void r (int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            reverse(arr,start,end);
            start++;
            end--;
        }
    }
    static void reverse(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
