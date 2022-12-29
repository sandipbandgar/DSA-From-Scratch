package MethodsInJava;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter month number");
        int month  = in.nextInt();
        System.out.println("enter year");
        int b = in.nextInt();
        System.out.println("Total days in " + month(month)+ ": "  + day(month,b));
        System.out.println("Even days in "+ month(month)+ ": "  + even(month,b));

    }
    static void NoDays(int a, String b){
        String[] days = new String[]{ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

    }
    static int even (int a, int b){
        int count = 0;
        int x = day(a,b);
        for (int i = 1; i <=x ; i++) {
            if (i % 2 !=0){
                count ++;
            }
        }
        return count;
    }
    static int day(int a, int b){

        if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12){
            return 31;
        } else if (a == 2 && leap(b)) {
            return 29;
        } else if (a == 2) {
            return 28;
        } else {
            return 30;
        }
    }
    static boolean leap (int a){
        if (a % 4 == 0){
            if (a % 100 == 0){
                return a % 400 == 0;
            }
            else return true;
        }
        else return false;
    }
    static String month(int a){
        String[] arr = {"x","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return arr[a];
    }
}
