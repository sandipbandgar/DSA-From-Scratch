package LinearSearch;

public class PracticeSearch8 {
    public static void main(String[] args) {
        int[] arr ={12,345,2,6,7896};
        System.out.println(count(-3445));
    }
    static int search(int [] arr){
        int count = 0;
        for (int x: arr) {
            if (even(x)){
                count++;
            }
        }

        return count;
    }
    static boolean even(int n){
        int numberDigits = count(n);
        return numberDigits % 2 == 0;
    }
    static int count (int n){
        if (n <0){
            n = n * -1;
        }
        if (n == 0){
            return 1;
        }
        int count = 0;
        while (n > 0){
            n= n/10;
            count ++;
        }
        return count;
    }
}
