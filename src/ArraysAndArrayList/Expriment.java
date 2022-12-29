package ArraysAndArrayList;

import java.util.Arrays;

public class Expriment {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(order(nums)));
    }
    static int[] order(int[] nums){
        int a = nums.length;
        int b = nums.length;
        int[] x = new int[a+b];
        System.arraycopy(nums,0,x,0,a);
        System.arraycopy(nums, 0,x,a,b);
        return x;
    }
}
