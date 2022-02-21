package stepik.functional_programming;

import java.util.function.Function;

public class NumberChangerWithFunctionalInterface {
    public static int substitution(int n, Function<Integer, Integer> digitRule) {
        String numberAsString = String.valueOf(n);
        int result = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            result *= 10;
            int nextDigit = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            result += digitRule.apply(nextDigit);
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 13313112;
        int result = substitution(number, digit -> digit < 9 ? digit + 1 : 0);
        System.out.println(result);
    }
}
