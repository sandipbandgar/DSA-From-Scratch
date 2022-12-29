package ArraysAndArrayList;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[in.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(hcf(20,40));
        System.out.println(lcm(20,40));
        System.out.println(arrayHcf(arr));
//        System.out.println(arrayLcm(arr));
    }
    static int arrayHcf(int[] arr){
        int hcf = arr[0];
        for (int i = 1; i < arr.length; i++) {
            hcf = hcf(hcf,arr[i]);
        }
        return hcf;
    }
//    static  int arrayLcm(int[] arr){
//        int l = 1;
//        for (int j : arr) {
//            l = lcm(l,arr[j])/hcf(l,arr[j]);
//        }
//        return l;
//    }
    static  int lcm (int a, int b){
        return a*b/hcf(a,b);
    }
    static int hcf (int a , int b) {
        while (b >0){
            int temp = b;
            b = a % b;
            a =temp;
        }
        return a;
    }
}
