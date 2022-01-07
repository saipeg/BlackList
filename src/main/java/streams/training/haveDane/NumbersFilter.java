package streams.training.haveDane;

import java.util.Arrays;

public class NumbersFilter {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 13, 34};

        Arrays.stream(numbers)
                .filter(numb -> numb % 2 == 0)
                .peek(System.out::println)
                .toArray();

        System.out.println(Arrays.toString(numbers));

        System.out.println("============== Same things with map ==============");

        numbers = Arrays.stream(numbers)
                .map(element -> {
                    if(element > 10) {
                        element = element * 2;
                    } return element;
                                }
                    ).toArray();

        System.out.println("numbers * 2 = " + Arrays.toString(numbers));


    }

}
