package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayShuffle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n");
        int n = in.nextInt();
        System.out.println("fill the array");
        int[] arr = new int[n*2];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
    static int [] shuffle(int[] arr,int n){
        int[] ans = new int[n*2];
        int i = 0;
        int j = n;
        int x = 0;
        while (i < n){
            ans[x] = arr[i];
            x++;
            i++;
            ans[x] = arr[j];
            x++;
            j++;
        }
        return ans;
    }
}
