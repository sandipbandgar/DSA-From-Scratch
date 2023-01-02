package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in . nextInt();
        }
        int t = in.nextInt();
        System.out.println(Arrays.toString(twoSum(arr,t)));
    }
    static int[] twoSum(int[] arr,int t){
        int[] ans = new int[2];

        for(int i = 0; i < arr.length; i++ ){

            for(int j = i+1; j < arr.length; j++){
                int sum = arr[i]+arr[j];
                if (sum==t){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}
