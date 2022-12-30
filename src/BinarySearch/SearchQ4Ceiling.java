package BinarySearch;

import java.util.Scanner;

public class SearchQ4Ceiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int t){
        int start = 0;
        int end = arr.length-1;
        boolean c =  arr[start] < arr[end];
        while (start <= end){

            int mid = start + (end-start) /2;

            if (t > arr[arr.length-1]){
                return -1;
            }

            if (arr[mid] == t){
                return mid;
            }
            if(c){
                if (t<arr[mid]){
                    end  = mid-1;
                } else  {
                    start = mid+1;
                }
            }else {
                if (t>arr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return start;
    }
}
