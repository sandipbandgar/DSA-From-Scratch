package ArraysAndArrayList;

import java.util.Arrays;

public class permutation {
    public static void main(String[] args) {
        int[] arr = {0,2,4,1,5,3};
        System.out.println(Arrays.toString(build(arr)));
    }
    static int[] build(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
