package BinarySearch;

import java.util.Scanner;

public class SearchQ6SmallestLetter {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        char[] a = new char[n];
        for (int i = 0; i < a.length ; i++) {
            a [i] = in.next().trim().charAt(0);
        }
        char target = in.next().trim().charAt(0);
        System.out.println(search(a,target));
    }
    static char search(char[] a, char t){
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (t < a[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return a[start%a.length];
    }
}
