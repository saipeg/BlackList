package april;

public class Factorial2 {
    static int getFactorial(int f) {
        if (f <= 1) {
            return f;
        } else {
            int result = f * getFactorial(f - 1);
            return result;
        }
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("getFactorial for number "
                + num
                + " = " + getFactorial( num));
    }
}
