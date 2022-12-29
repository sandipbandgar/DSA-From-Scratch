package LinearSearch;

import java.util.Scanner;

public class PracticeSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {123,34,54,56,34,657,6,789,90,2334,6576,786,6898,675452,};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }
}
