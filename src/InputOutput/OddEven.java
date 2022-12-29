package InputOutput;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if(input % 2 == 0){
            System.out.println("it is a even number");
        }else {
            System.out.println("it is a odd number");
        }
    }
}
