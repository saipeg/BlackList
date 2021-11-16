package streams;

import java.util.function.Function;
import java.util.stream.LongStream;

public class HelloWithStream {
    public static void main(String[] args) {

        final String hello = "Hello, ";
        Function<String, String> helloFunction = (name) -> hello + name;

        System.out.println(helloFunction.apply("John"));
        System.out.println(helloFunction.apply("Anastasia"));

        int constant = 100;
        Function<Integer, Integer> adder = x -> x + constant;

        System.out.println(adder.apply(200));
        System.out.println(adder.apply(300));

        System.out.println(longCalculate(1, 4));

    }

    public static long longCalculate(long a, long b) {
        Long reduce = LongStream.rangeClosed(a, b).boxed().reduce(1L, (x, y) -> x * y);
        return reduce;
    }



}
