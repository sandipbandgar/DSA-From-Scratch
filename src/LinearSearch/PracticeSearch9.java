package LinearSearch;

public class PracticeSearch9 {
    public static void main(String[] args) {

    }
    int wealth(int[][] arr){
        int ans = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}
