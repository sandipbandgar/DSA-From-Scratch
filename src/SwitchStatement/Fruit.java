package SwitchStatement;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case("mango"):
                System.out.println("King of fruit");
                break;
            case("apple"):
                System.out.println("a Sweet red fruit");
                break;
            case("grapes"):
                System.out.println("A tiny lity pity fruit");
                break;
            case("orange"):
                System.out.println("A orange Nagpur fruit");
                break;
            default:
                System.out.println("Please enter right fruit");
        }

//        Enhanced switch case it looks very neat

        switch (fruit) {
            case ("mango") -> System.out.println("King of fruit");
            case ("apple") -> System.out.println("a Sweet red fruit");
            case ("grapes") -> System.out.println("A tiny lity pity fruit");
            case ("orange") -> System.out.println("A orange Nagpur fruit");
            default -> System.out.println("Please enter right fruit");
        }

    }
}
