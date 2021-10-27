package april;

public class FactorialTest {

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }

    static public String factorial(String n) {

        int value = Integer.parseInt(n);

        if (value < 0) {
            throw new IllegalArgumentException();
        }
        return String.valueOf(getFactorial(value));
    }

    public static void main(String[] args) {
        System.out.println(factorial("-1"));
    }
}
