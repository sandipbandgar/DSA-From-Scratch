package LinearSearch;

import java.util.Scanner;

public class PracticeSearch3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        char target = in.next().trim().charAt(0);
        System.out.println(search(a,target));

    }
    static boolean search(String a, char b){
        if (a.length() == 0){
            return false;
        }
        for (char ans: a.toCharArray()
             ) {
            if (ans == b){
                return true;
            }
        }
        return false;
    }
}
