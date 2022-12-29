package LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr ={1,2,3,44,5,67,78,89,9,45,433,23,323,2};
        System.out.println("enter target");
        int target = in.nextInt();
        System.out.println("enter starting index");
        int start = in.nextInt();
        System.out.println("enter last index");
        int end = in.nextInt();
        System.out.println(range(arr,target,start,end));

    }
    static int range(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
