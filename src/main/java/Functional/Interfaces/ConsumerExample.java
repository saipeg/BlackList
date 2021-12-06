package Functional.Interfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> helloForAny =
                x -> System.out.println("Hello " + x + " in java world!");
        helloForAny.accept("Andrew");
    }

}
