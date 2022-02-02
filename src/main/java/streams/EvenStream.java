package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class EvenStream {
    public static void main(String[] args) {
        List<Integer> someNumbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(someNumbers);
        System.out.println("==========================================");

        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(s1 -> s1.toUpperCase())
                .forEach(System.out::println);

    }

    public void doSmth2() {
//        Stream<String> myStream = Stream.of("1", "2")
//                .parallel()
//                .sequential()
//                .map(x -> x.length())
////                .filter(x -> );
////                .collect(toSet());
    }


}
