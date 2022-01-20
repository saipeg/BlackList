package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodTests {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Collections.addAll(list1, 1, 2, 3, 4, 5);
        Collections.addAll(list2, 1, 2, 3);

        System.out.println("List1: " + list1.toString());
        System.out.println("List2: " + list2.toString());

        list1.retainAll(list2);
        System.out.println("List1: " + list1.toString());

    }
}
