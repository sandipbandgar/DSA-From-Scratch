package BinarySearch;

import java.util.Arrays;

public class SearchQ2DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,-65,-432};
        int target = 7;
        int ans = search(arr,target);
        System.out.println(ans);

    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (target < arr[mid]){
                start = mid+1;
            }else if (target > arr[mid]){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
