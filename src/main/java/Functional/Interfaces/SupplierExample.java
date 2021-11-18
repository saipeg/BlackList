package Functional.Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*

 */
public class SupplierExample {
    public static void main(String[] args) {




        List<String> nameList = new ArrayList<>();
        nameList.add("Elena");
        nameList.add("Sasha");
        nameList.add("Petia");
        nameList.add("Gowa");
        nameList.add("Ola");
        nameList.add("Katy");

        System.out.println(nameList);

        Supplier<String> randomName = () -> {
            int value = (int) (Math.random() * nameList.size());
            return nameList.get(value);
        };

        System.out.println(randomName.get());

    }


}
