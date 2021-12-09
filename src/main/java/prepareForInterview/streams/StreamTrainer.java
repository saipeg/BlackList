package prepareForInterview.streams;

import java.util.List;
import java.util.stream.IntStream;

public class StreamTrainer {
    public static void main(String[] args) {
        IntStream.iterate(100, i -> i - 1);

        List<Integer> list = List.of(1, 2, 3);
        list.stream()
                .map(i -> i * i)
                .filter(el -> el > 3)
                .peek(el -> System.out.println(el));
    }
}
