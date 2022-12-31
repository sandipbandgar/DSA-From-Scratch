package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Revise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr  = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(ans(arr)));
    }
    static int [] ans(int[] arr){
        int [] a = new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            a[i] = arr[arr[i]];
        }
        return a;
    }
}
