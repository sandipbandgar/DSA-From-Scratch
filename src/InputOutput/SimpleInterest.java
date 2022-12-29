package InputOutput;


import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter principle");
        int p = in.nextInt();
        System.out.println("enter Time");
        int t = in.nextInt();
        System.out.println("enter Interest rate");
        int r = in.nextInt();
        int SI = (p*t*r)/100 - p;
        System.out.println("your Simple interest: "+ SI);
        System.out.println("your Amount + simple interest: "+ (p*t*r)/100);
    }
}
