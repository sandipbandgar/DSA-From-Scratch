package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchQ7FirstAndLastPosition {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[] a, int t){
            int[] ans = {-1,-1};
            ans[0] = search(a,t,true);
            if(ans[0] != -1) {
                ans[1] = search(a, t, false);
            }
            return ans;
    }
    static int search(int[] a, int t, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = a.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if (t < a[mid]){
                end = mid-1;
            } else if (t > a[mid]) {
                start = mid+1;
            }else{
                ans = mid;
                if (findStartIndex){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans ;
    }
}
