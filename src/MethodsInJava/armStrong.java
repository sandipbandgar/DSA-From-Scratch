package MethodsInJava;

import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(arm(n));
        for (int i = 0; i < 1000; i++) {
            if(arm(i)){
                System.out.println(i);
            }
        }
    }
    static boolean arm(int n){
        int x = n;
        int sum = 0;
        while(n > 0){
            int ans = n%10;
            n = n/10;
            int multi = ans * ans * ans;
            sum = sum + multi;
//            System.out.print(multi+" + ");
        }
//        System.out.println(" = "+sum);
        return sum == x;
    }
}
