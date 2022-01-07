package streams.training.haveDane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWithList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Vsem");
        list.add("Privet");
        list.add("OK");
        list.add("Poka");

        List<Integer> listInt = list
                .stream()
                .map(
                        element -> element.length()
                )
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(listInt);

        int[] array = {1, 2, 3, 5, 8, 11};

        array = Arrays.stream(array).map(
                element -> {
                    if (element % 2 == 0) {
                        element = element / 2;
                    }
                    return element;
                }).toArray();

        System.out.println(Arrays.toString(array));

        System.out.println("====================== filter =======================");

        array = Arrays.stream(array)
                .filter(element -> element % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(array));

        System.out.println("=================== reduce ==========================");

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        System.out.println();
        Optional<String> sentence = wordsStream.reduce((x, y)->x + " " + y);
        System.out.println(sentence.get());

        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6);
        Optional<Integer> result = numbersStream.reduce((x,y)->x*y);
        System.out.println(result.get()); // 720

        System.out.println("=================== parallelStream ==========================");

        List<Double> listDouble = new ArrayList<>();
        listDouble.add(10.0);
        listDouble.add(4.0);
        listDouble.add(1.0);
        listDouble.add(0.25);

        double divisionResult = listDouble.parallelStream() //or parallelStream
                .reduce((a, b) -> a / b).get();

        System.out.println("divisionResult = " + divisionResult);


    }
}
