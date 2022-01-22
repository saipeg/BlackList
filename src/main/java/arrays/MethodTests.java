package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodTests {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        List<Integer> list2 = new ArrayList<>() {{
            add(2);
            add(3);
        }};
        List<Integer> list3 = new ArrayList<>(){{
            add(2);
        }};

        list2.retainAll(list3);
        list2.retainAll(list1);
        System.out.println("List1: " + list2);
    }


}
