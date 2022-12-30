package ArraysAndArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number values you want to enter in array");
        int n = in.nextInt();
        System.out.println("enter array values");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter extra candies");
        int extraCandies = in.nextInt();

        List<Boolean> ans = extra(arr,extraCandies);
        System.out.println(ans);
    }
    static List<Boolean> extra(int[] arr, int a){
        int max = arr[0];
        for (int k : arr) {
            if (k > max) {
                max = k;
            }
        }

            List<Boolean> ans = new ArrayList<>();

        for (int i : arr) {
            if (i + a < max) {
                ans.add(false);
            } else {
                ans.add(true);
            }
        }
        return ans;
    }
}
