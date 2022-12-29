package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray1 {
    public static void main(String[] args) {

        int [][] arr = new int[4][5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= in.nextInt();
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
