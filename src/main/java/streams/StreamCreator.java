package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCreator {
    public static void main(String[] args) {
        List<String> someList = Arrays.asList("Andrew", "Serg", "Petia", "Gowa");

        List<Integer> newSomeList = someList.stream()
                .map(element -> element.length())
                .filter(x -> x > 4)
                .sorted()
//              .forEach(System.out::println);
                .collect(Collectors.toList());

        System.out.println(newSomeList);

        // Or we can create stream in Arrays.stream:
        int[] someArray = {458, 23311, 333, 543, 567, 876, 642};

        Arrays.stream(someArray)
                .filter(x -> x > 500 && x < 1000)
                .forEach(x -> {
                    x *= 2;
                    System.out.println(x);
                });

    }

}
