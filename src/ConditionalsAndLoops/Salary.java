package ConditionalsAndLoops;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter salary");
        int salary = in.nextInt();
        if (salary < 10000 && salary>1000){
            salary= salary + 1000;
            System.out.println("Total salary: " + salary);
        }
        else if(salary > 10000 && salary < 100000) {
            salary = salary + 2000;
            System.out.println("Total salary: " + salary);
        }
        else if (salary > 100000 && salary < 10000000) {
            salary = salary + 10000;
            System.out.println("Total salary: " + salary);
        }
        else if (salary > 0 && salary < 1000){
            System.out.println("you don't have salary earn motherF");
        }
        else {
            System.out.println("You are a business Man");
        }
    }
}
