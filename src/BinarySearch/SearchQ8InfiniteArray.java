package BinarySearch;

public class SearchQ8InfiniteArray {
    public static void main(String[] args) {
        int[] a = {12,23,34,45,65,67,89,90,234,236};
        int t = 45;
        System.out.println(ans(a,t));

    }
    static int ans(int[] arr, int t){
        int start = 0;
        int end = 1;
        while (t > arr[end]){
            int temp = end+1;
            end = (end - start+1)*2;
            start = temp;

        }
        return search(arr,t,start,end) ;
    }
    static int search (int[] arr,int t, int start, int end){
        while (start <= end){
            int mid = start + (end-start)/2;
            if (t < arr[mid]){
                end = mid-1;
            }else if(t > arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
