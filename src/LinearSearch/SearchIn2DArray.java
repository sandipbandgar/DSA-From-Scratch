package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = {
                {13,234,54,5,6},
                {23,34,545,6,},
                {23,435,45,423},
                {33,43,5,4,56,7,87,}
        };
        int target = in.nextInt();
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j]==target){
                    return new int[] {i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
