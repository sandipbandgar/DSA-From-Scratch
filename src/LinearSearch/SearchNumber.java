package LinearSearch;

import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {12,23,342,443,22,32,12,56,7,687,8,78,9,65,343,235};
        int target = 7;
        int ans = linearSearch(arr,target);
        System.out.println("Your target is at index no: "+ ans );
    }
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i <arr.length ; i++) {
                int num = arr[i];
            if (target == num) {
                return i;
            }
        }
        return -1;
    }

}
