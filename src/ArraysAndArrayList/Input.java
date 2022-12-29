package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
        arr[0] = 43;
        arr[1] = 443;
        arr[2] = 35;
        arr[3] = 54;
        arr[4] = 456;
        System.out.println(arr[2]);

        //input using for loops
//        integer input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for(int j: arr){
            System.out.print(j + " ");
        }
        System.out.println();
//        String input
        String [] arr2 = new String[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in .next();
        }
        arr2 [3] = "sandy";
        for(String j : arr2){
            System.out.print(j + " ");
        }

    }
}
