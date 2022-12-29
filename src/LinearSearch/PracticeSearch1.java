package LinearSearch;
import java.util.Scanner;

public class PracticeSearch1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {12,23,45,54,567,78,87,99,3};
        int target = in.nextInt();
        System.out.println(search(arr,target));
    }
    static int search(int[] arr , int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i <arr.length ; i++) {
                if (arr[i] == target){
                    return i;
                }
        }
        return -1;
    }
}
