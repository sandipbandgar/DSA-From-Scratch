package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchQ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x = new int[100];
        for (int i = 0; i < x.length; i++) {
            x[i]= i+1;
        }
        System.out.println(Arrays.toString(x));
        int target = in.nextInt();
        System.out.println(binary(x,target));

    }
    static int binary(int[]arr, int t) {
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int middle = start+(end-start)/2;
            if (t > arr[middle]){
                start = middle +1;
            } else if (t < arr[middle]) {
                end = middle -1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
