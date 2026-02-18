package training._1_from_10_to_binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class From_10_to_binary {
    public static void main(String[] args) {
        // Необходимо создать метод, на вход которого прилетает десятичная, а на выходе бинарный эквивалент.

        int[] ints1 = from10ToBinary(20);
        int[] ints = from10ToBinary(3112); //110000101000
        int[] fromString = from10ToBinary(3112); //110000101000

        System.out.println("From number" + Arrays.toString(ints1) + "sdsd" + Arrays.toString(ints));
        System.out.println("From string: " + Arrays.toString(fromString));
    }

    private static int[] from10ToBinary(int number) {
        List<Integer> result = new ArrayList<>();

        while (number > 0) {
            int preResult = number % 2;
//            result.addFirst(preResult);
            number = number / 2;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] from10ToBinary(String number) {
        int i = Integer.parseInt(number);
        return from10ToBinary(i);

    }

}
