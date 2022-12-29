package ArraysAndArrayList;

import java.util.ArrayList;

public class   ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(232);
        list.add(34);
        list.add(4334);
        list.add(65);
        System.out.println(list.contains(3445));
        list.set(1,2344);
        System.out.println(list);
    }
}
