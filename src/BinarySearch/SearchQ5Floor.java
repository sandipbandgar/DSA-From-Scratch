package BinarySearch;

import java.util.Scanner;

public class SearchQ5Floor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr, int t){
        int start = 0;
        int end = arr.length-1;
        boolean asc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] == t){
                return mid;
            }
            if (asc){
                if (t > arr[mid]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }else {
                if (t<arr[mid]){
                    start=mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return end;
    }
}
