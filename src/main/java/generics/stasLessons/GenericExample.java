package generics.stasLessons;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("String");
        String result = list.get(0);
        System.out.println("result = " + result);

        List secondList = new ArrayList();
        secondList.add("Second String");
        String result2 = (String) secondList.get(0);
        System.out.println("result2 = " + result2);
    }
}
