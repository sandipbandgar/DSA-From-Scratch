package Patterns;

public class Q2 {
    public static void main(String[] args) {
        int n = 5;
        q2(n);
    }
    static void q2(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}
