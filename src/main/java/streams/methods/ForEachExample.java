package streams.methods;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int[] arrayOfNumber = {1, 3, 4, 6, 13, 34, 73, 331, 346};

        Arrays.stream(arrayOfNumber)
                .filter(x -> x > 10 && x < 100)
                .forEach(x -> {
                    x *= 2;
                    System.out.println(x);
                });

        System.out.println("Below print with method reference");
        Arrays.stream(arrayOfNumber)
                .forEach(System.out::println);
        Utils utilsVariable = new Utils();
        System.out.println("Below print with method reference 2 version");
        Arrays.stream(arrayOfNumber)
                .forEach(utilsVariable::myMethod);
/*          it's same:
        Arrays.stream(arrayOfNumber)
                .forEach(x -> Utils.myMethod(x));
*/
    }
}

class Utils {
    public void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }

    public static void myMethod2(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }

}
