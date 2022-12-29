package LinearSearch;

public class SearchMin {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,65,342,2,76,56,45,-34};
        System.out.println("your minimum number in array: ");
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min = arr[0];
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                return min;
            }
        }
        return Integer.MIN_VALUE;
    }
}
