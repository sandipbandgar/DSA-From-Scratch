package InputOutput;

import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello welcome mr./mrs " + name);
    }
}
