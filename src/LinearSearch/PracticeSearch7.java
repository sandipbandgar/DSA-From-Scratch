package LinearSearch;

import java.util.Scanner;

public class PracticeSearch7 {
    public static void main(String[] args) {
        int [][] arr = {
                {12,23,34,455,667,87},
                {234,456,67,8887,544},
                {323,454,657,432,23234}
        };
        System.out.println(max(arr));
    }
    static int max(int[][]arr){
        int maxN= Integer.MIN_VALUE;
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] > maxN){
                    maxN = arr[i][j];
                }
            }
        }
        return maxN;
    }
}
