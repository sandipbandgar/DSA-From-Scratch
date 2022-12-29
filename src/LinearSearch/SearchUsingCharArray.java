package LinearSearch;

import java.util.Scanner;

public class SearchUsingCharArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string");
        String str = in.next();
        System.out.println("enter target");
        char target = in.next().trim().charAt(0);
        System.out.println(findChar(str,target));

    }
    static boolean findChar(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for(char i: str.toCharArray()){
            if (i == target){
                return true;
            }
        }
        return false;
    }
}
