package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class StringLengthComparator {

//    @Override
//    public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "Как", "дела?");
        list.sort((o2, o1) -> o1.length() - o2.length());
//        list.sort(new StringLengthComparator());
        System.out.println(list);
    }
}