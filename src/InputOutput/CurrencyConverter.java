package InputOutput;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Amount in Rupee");
        double Rupee = in.nextDouble();
        Double dollar =  Rupee/81.56;
        System.out.println("Your amount in Dollar: " + Math.round(dollar));
    }
}
