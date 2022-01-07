package streams.training.haveDane;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamInWordOutNumber {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Kak");
        list.add("Dela");
        list.add("Pokeda");

        System.out.println("list before = " + list);

        List<Integer> result = list.stream()
                .map(
                        element -> element.length()
                ).peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("result after = " + result);

    }
}
