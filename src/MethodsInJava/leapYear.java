package MethodsInJava;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(leap(n));
    }
    static boolean leap(int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                return year % 400 == 0;
            }
            else return true;
        }else return false;
    }
}
