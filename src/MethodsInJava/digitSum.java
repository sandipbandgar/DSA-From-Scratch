package MethodsInJava;

import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int a){
        if (a == 0){
            return 0;
        }
        int add = 0;
        while (a > 0){
            int temp = a % 10;
            a = a / 10;
            add = temp + add;
        }
        return add;
    }
}
