package optonal;

import java.util.Optional;

public class optionalExample {
    public static void main(String[] args) {
        Optional<String> empty = Optional.of("hello");
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        String orElse  = empty.orElse("world");
        System.out.println(orElse);

        System.out.println("=============================");

        //Optional<String> emptyWithNull = Optional.of(null); //if not null - return that,
        //String orElseWithNull  = epmtyWithNull.orElse("world");
        //System.out.println(orElseWithNull); //will throw runtime exception

        System.out.println("=============================");

        Optional<String> emptyWithNullable = Optional.ofNullable(null);
        String orElseWithNullable  = emptyWithNullable.orElse("world");
        System.out.println(orElseWithNullable);

        System.out.println("=============================");

        Optional<String> hello = Optional.ofNullable("hello"); //if null - get world
        String helloUp  = hello
                .map(s -> s.toUpperCase())
                .orElseGet(() -> {               //.orElse("world") a variant
                return "world";
                });
        System.out.println(helloUp);

    }
}
