package september;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class MyCollections {
    static Integer a;

    public enum Test {
        DOWN,
        LEFT,
        RIGHT,
        UP,
    }

    public static void main(String[] args) {

//        System.out.println(a);
//        Test test = Test.DOWN;
//        if(test == Test.LEFT) {
//            test = Test.RIGHT;
//        }else {
//            test = Test.DOWN;
//        }

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("My name is");
//        list.add("Andrew");
//        System.out.println(list);
        Set<Element> set = new HashSet<>();

        System.out.println(set);
     


    }
}

