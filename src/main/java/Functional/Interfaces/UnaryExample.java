package Functional.Interfaces;

import java.util.Locale;
import java.util.function.UnaryOperator;

public class UnaryExample {
    public static void main(String[] args) {

        UnaryOperator<String> valueConverter = x -> x.toUpperCase(Locale.ROOT);
        System.out.println(valueConverter.apply("678"));
    }
}
