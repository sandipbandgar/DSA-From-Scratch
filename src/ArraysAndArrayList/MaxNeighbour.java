package ArraysAndArrayList;

import java.util.Scanner;

public class MaxNeighbour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(max(a,n));

    }
    static int max(int[] arr, int n){
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n-1] >= arr[n-2])
            return n-1;


        for (int i = 1; i < n-1; i++) {
            if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1] ) {
                return arr[i];
            }
        }
        return 0;
    }
}
