package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeSearch6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = {
                {12,23,54,65,7,76,87,87},
                {12,3,4,45,656,65,54,34},
                {2,3,4,45,56,4,3,2,21,3},
                {23,34,23,345,45,6,2,312}
        };
        int target = in.nextInt();
        int [] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
