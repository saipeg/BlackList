package streams;

import java.util.*;
import java.util.stream.Stream;

public class FlatMapGum {
    public static void main(String[] args) {
        List<Integer> list = Stream.generate(new Random()::nextInt).limit(100).toList();
        System.out.println(list);

        StringJoiner stringJoiner = new StringJoiner(" + ", "999", "ZZZZZ");
        stringJoiner.add("asdasd");
        stringJoiner.add("111");
        stringJoiner.add("3441");

        System.out.println(stringJoiner);

//        Stream.generate(new Random :: nextInt).limit(1())




    }
}
