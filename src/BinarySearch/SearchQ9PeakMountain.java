package BinarySearch;

public class SearchQ9PeakMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,34,45,67,78,45,34,32,12};
        System.out.println(search(arr));
    }
    static int search(int[]a){
        int start = 0;
        int end = a.length-1;
        while (start < end){
            int mid = start + (end-start)/2;
            if (a[mid] > a[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
