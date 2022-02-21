package stepik.functional_programming;

public class MyRunWithNumberChangerWithFunctionalInterface {
    public static void main(String[] args) {
        int nubms = 948717812;

        int result =
                NumberChangerWithFunctionalInterface.substitution(38731212, x -> x % 2 == 0 ? x + 1 : 0);
        System.out.println("Numbers before: " + nubms + "\nNumbers after: " + result);
    }
}
