package games.micro;

public class Factorial {

    static int getFactorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }

    static int getFactorialFromRecurse(int a) {

        int result;
        if (a == 0) return 1;
        result = getFactorialFromRecurse(a - 1) * a;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Факториал = " + getFactorial(10));
        System.out.println();
        System.out.println("Фактрриал через рекурсию = " + getFactorialFromRecurse(10));
    }

}
