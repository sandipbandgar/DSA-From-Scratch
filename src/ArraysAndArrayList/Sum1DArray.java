package ArraysAndArrayList;

import java.util.Arrays;

public class Sum1DArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(sum(arr)));
    }
    static int[] sum (int[] arr){
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            ans[i] = ans[i-1] + arr[i];
        }
        return ans;
    }
}
