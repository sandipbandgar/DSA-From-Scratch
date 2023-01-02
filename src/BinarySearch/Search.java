package BinarySearch;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int t = 3;
        System.out.println(search(arr,t));
    }
    static int search(int[] arr, int t){
        int start = 0;
        int end = arr.length-1;
        boolean asc = start < end;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (t == arr[mid]){
                return mid;
            }
            if (asc){
                if (t < mid){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else {
                if (t > mid){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
