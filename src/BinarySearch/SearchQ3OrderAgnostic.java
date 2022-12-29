package BinarySearch;

import java.util.Scanner;

public class SearchQ3OrderAgnostic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int[] arr = {43,34,21,20,15,13,12,10,9,8,-12,-232,-234};
         int[] arr1 = {1,2,3,4,5,43,65,67,78,89,100,3434};
         int t = 20;
         int ans = search(arr,t);
         int ans2 = search(arr1,100);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int search(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean asc = arr[start] < arr[end];

            while (start <= end){

                int mid = start + (end-start)/2;

                if(arr[mid]==target) {
                    return mid;
                }

                if (asc){
                    if (target > arr[mid]){
                            start = mid + 1;
                    } else{
                            end = mid -1;
                    }
                }else {
                    if (target < arr[mid]){
                        start = mid + 1;
                    } else {
                        end = mid -1;
                    }
                }
            }
            return -1;
    }

}
