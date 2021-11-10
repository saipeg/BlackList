package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenStream {
    public static void main(String[] args) {
        List<Integer> someNumbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(someNumbers);
    }
}
