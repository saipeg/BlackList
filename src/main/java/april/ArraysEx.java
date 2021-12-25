package april;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(list);

        list.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println); // link to method
//      list.stream().filter(integer -> integer % 2 == 0).forEach(integer -> System.out.println(integer));


// Above the same
//        list.stream().filter(new Predicate<Integer>() { //test for an object, can go next step or not
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        }).forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });;
    }

}
