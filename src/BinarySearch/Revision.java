package BinarySearch;

public class Revision {
    public static void main(String[] args) {
        int [] n = {1,23,45,56,67,78,98,567};
        int t = 45;
        System.out.println(search(n,t));
    }
    static int search(int[] arr, int t){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (t < arr[mid]){
                end = mid-1;
            }else if (t > arr[mid]){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
