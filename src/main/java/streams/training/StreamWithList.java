package streams.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        System.out.println("=============================================");

        array = Arrays.stream(array)
                .filter(element -> element % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(array));


    }
}
