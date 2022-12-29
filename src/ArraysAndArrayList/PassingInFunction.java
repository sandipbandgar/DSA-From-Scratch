package ArraysAndArrayList;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] num = {1,34,43,3,34};
        System.out.println(Arrays.toString(num));
        array(num);
        System.out.println(Arrays.toString(num));
    }
    static void array(int [] arr){
        arr[0] = 69;
    }
}
