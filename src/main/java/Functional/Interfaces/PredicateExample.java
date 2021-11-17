package Functional.Interfaces;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;
        //We can extract method reference for write like: PredicateExample::test

        System.out.println(isEvenNumber.test(3));
        System.out.println(isEvenNumber.test(4));
        System.out.println("==============================================");

        List<Integer> evenNubmerInStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        evenNubmerInStream.forEach(System.out::println);

    }
}
