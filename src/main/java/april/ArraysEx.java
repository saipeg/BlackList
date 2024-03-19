package april;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArraysEx {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        Thread.sleep(5000);
        IntStream.range(0, list.size()).forEach(i -> {
            list.add(3);
            System.out.println(i);
        });
        System.out.println(list);

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
