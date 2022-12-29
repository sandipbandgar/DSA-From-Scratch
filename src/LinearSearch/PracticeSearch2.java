package LinearSearch;

import java.util.Scanner;

public class PracticeSearch2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        char target = in.next().trim().charAt(0);
        System.out.println(search(name,target));
    }
    static boolean search (String a, char b){
        if (a.length() == 0){
            return false;
        }

        for (int i = 0; i <a.length() ; i++) {
            char ans = a.trim().charAt(i);
            if (ans == b){
                System.out.println("yes "+ans +" char is in String: ");
                return true;
            }
        }
        return false;
    }
}
