package Functional.references;

import java.util.function.Function;

public class ReferenceToInstance {
    public static void main(String[] args) {
        String address = "11521 Shawnee Road, Greenwood DE 19950";
        String message = "Found such symbol in this index: ";

        Function<String, Integer> indexing = address::indexOf;

        System.out.println(message + indexing.apply("115"));
        System.out.println(message + indexing.apply("DE"));
        System.out.println(message + indexing.apply("Green"));


        Function<Long, Double> converter = Long::doubleValue;
        System.out.println("converter.apply(500L) = " + converter.apply(500L));
        System.out.println("converter.apply(300L) = " + converter.apply(300L));
    }

}
