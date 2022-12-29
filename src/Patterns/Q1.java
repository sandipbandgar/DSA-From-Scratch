package Patterns;

public class Q1 {
    public static void main(String[] args) {
        int n =5;
        q1(n);
    }
    static void q1(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
