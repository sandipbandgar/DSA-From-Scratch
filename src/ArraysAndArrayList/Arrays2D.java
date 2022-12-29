package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int [][] arr2D = new int[3][3];
        int [][] arr2D = {
                {1,2,3}, // 0th index
                {10,20,30}, // 1st index
                {100,200,300} // 2nd index
        };

        System.out.println(Arrays.toString(arr2D[1]));

        //input
        int [][] arr = new int[3][3];
//        System.out.println(arr.length); it will print outer array length
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        //Output
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//        }

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for(int[] row: arr){
            System.out.println(Arrays.toString(row));
        }
    }

}
