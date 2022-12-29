package Patterns;

public class Q4 {
    public static void main(String[] args) {
        int n =5;
        q4(n);
    }

    static void q4(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
