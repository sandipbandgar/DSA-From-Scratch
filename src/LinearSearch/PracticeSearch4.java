package LinearSearch;

import java.util.Scanner;

public class PracticeSearch4 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,78,9,0,12,34};
        int target = in.nextInt();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(search(arr,target,start,end));
    }
    static boolean search(int[] a,int target, int start, int end){
        if (a.length == 0 ){
            return false;
        }
        for (int i = start; i <end; i++) {
            if (a[i] == target){
                return true;
            }
        }
        return false;
    }
}
