package MethodsInJava;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int [] arr = {10,209,34,43,234,33};
        array(arr);
        System.out.println(Arrays.toString(arr));
    }
//    it gonna change the values in array because it is modifying the array
//    in primitive data types you cannot modify them by taking their index.
    static void array(int[] nums){
        nums[0] = 99;
    }
}
