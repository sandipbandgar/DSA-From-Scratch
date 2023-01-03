package ArraysAndArrayList;

import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] arr= {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(arr,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int length=nums.length;
        int[] result=new int[length];
        for(int i=0;i<length;i++){
            if(i==index[i]) {
                result[i] = nums[i];
            }
            else{

                int min=Math.min(i,index[i]);
                int max=Math.max(i,index[i]);
                for(int j=max;j>min;j--){
                    result[j]=result[j-1];
                }
                result[min]=nums[i];
            }
        }
        return result;
    }
}
