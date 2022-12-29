package LinearSearch;

import java.util.Scanner;

public class SearchChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String xyz = in.next();
        char target = in.next().trim().charAt(0);
        System.out.println(findS(xyz,target));
    }
    static boolean findS(String a, char target){
        if(a.length() == 0) {
          return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (target == a.charAt(i)){
                    return true;
            }
        }
        return false;
    }

}
