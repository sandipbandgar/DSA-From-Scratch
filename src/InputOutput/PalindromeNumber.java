package InputOutput;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int z =0 ;
        int temp = a;
        while ( a > 0){
            int x = a % 10;
            a = a /10;
            z =  z * 10 + x;
        }
        if(z == temp ){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
