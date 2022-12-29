package ArraysAndArrayList;

import java.util.Arrays;

public class concatination {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int[] numm1 = nums;

        int a = nums.length;
        int b = numm1.length;
        System.out.println(Arrays.toString(numm1));
        int [] ans = new int[a + b];
        System.arraycopy(nums,0,ans,0,a);
        System.arraycopy(nums,0,ans,a,b);
        System.out.println(Arrays.toString(ans));
    }
}
