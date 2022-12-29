package ArraysAndArrayList;

import java.util.Arrays;

public class Sum2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,1,5,6}
        };
        int ans = wealth(arr);
        System.out.println(ans);
    }
    static int wealth(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int j =0; j < arr.length; j++){
            int sum = 0;
            for (int i = 0; i < arr[j].length; i++) {
                sum = sum + arr[j][i];

                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
