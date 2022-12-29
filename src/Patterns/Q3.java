package Patterns;

public class Q3 {
    public static void main(String[] args) {
        int n =5;
        q3(n);
    }
    static void q3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
