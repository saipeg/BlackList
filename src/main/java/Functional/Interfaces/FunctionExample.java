package Functional.Interfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, Integer> valueConverter = x -> Integer.valueOf(x);
        System.out.println(valueConverter.apply("678"));
    }
}
