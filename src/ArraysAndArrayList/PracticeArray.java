package ArraysAndArrayList;

import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
