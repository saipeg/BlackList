package stepik.functional_programming;

import java.util.function.BiFunction;

public class MyBiFunctionOperator {
    // assign a lambda expression to this variable
    //static BiFunction<Integer, Integer, Integer> function

    public static MyBiFunctionOperator getInstance() {
        return new MyBiFunctionOperator();
    }

    static BiFunction<Integer, Integer, Integer> function = (a, b) -> {
        if (a < b) return a;
        return b;
    };

    public static void main(String[] args) {
        int first = 6;
        int second = 7;

        int result = function.apply(first, second);
        System.out.println("Result from work BiFunctional Interface. Minimal number between "
                + first
                + " and "
                + second
                + " is "
                + result);
    }

}
