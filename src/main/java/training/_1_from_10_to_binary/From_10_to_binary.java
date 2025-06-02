package training._1_from_10_to_binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class From_10_to_binary {
    public static void main(String[] args) {
        // Необходимо создать метод, на вход которого прилетает десятичная, а на выходе бинарный эквивалент.

        int[] ints1 = from10ToBinary(20);
        int[] ints = from10ToBinary(3112); //110000101000

        System.out.println(Arrays.toString(ints1) + "sdsd" + Arrays.toString(ints) );
    }

    private static int[] from10ToBinary(int number) {
        List<Integer> result = new ArrayList<>();

        while (number > 0) {
            int preResult = number % 2;
            result.addFirst(preResult);
            number = number / 2;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static String from10ToBinary(String number) {

        StringBuffer result = new StringBuffer(number);



        return "10"; //TODO
    }
}
