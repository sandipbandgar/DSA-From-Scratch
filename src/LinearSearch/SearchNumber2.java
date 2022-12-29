package LinearSearch;

import java.util.Scanner;

public class SearchNumber2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {12,23,43,54,56,67,87,909,543,43223,23,2,32,12,};
        int target = in.nextInt();
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        for (int num : arr) {
            if (num == target) {
                return target;
            }
        }
        return Integer.MIN_VALUE;
    }
}
