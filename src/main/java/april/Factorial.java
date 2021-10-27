package april;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger getFactorial(int f) {
        if (f <= 1) {
            return BigInteger.valueOf(1);
        }
        else {
            return BigInteger.valueOf(f).multiply(getFactorial(f - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(13));
    }
}
