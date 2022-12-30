package ArraysAndArrayList;

import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(pairs(arr));
    }
    static int pairs(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
