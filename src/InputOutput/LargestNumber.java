package InputOutput;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1 = in.nextInt();
        System.out.println("Enter Number2");
        int num2 = in.nextInt();

        if( num1 >= num2){
            System.out.println("num 1 is greater than num 2");
        } else{
            System.out.println("num 2 is greater than num 1");
        }

    }
}
