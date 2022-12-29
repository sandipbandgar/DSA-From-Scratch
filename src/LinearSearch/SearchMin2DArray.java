package LinearSearch;

import java.util.Scanner;

public class SearchMin2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {154,23,54,45,65,76,78},
                {433,455,34,54,454,5657,67},
                {343,345,56,65,76,678},
                {23,34,54656,77,788,898},
                {1233,23,45,56,7,-223,223}
        };
        System.out.println(search(arr));
    }
    static int search(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
      return min;
    }
}
