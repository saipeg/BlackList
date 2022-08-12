package exceptions;

public class ExceptionExample {

    public static void main(String[] args) {

        class NotIntResultException extends Exception {
            int a;
            int b;

            NotIntResultException(int a, int b) {
                this.a = a;
                this.b = b;
            }

            @Override
            public String toString() {
                return "Результат операции " +
                        +a + " / " + b + " не является целым числом";
            }
        }

        int[] num = {1, 3, 5, 7, 13, 16, 166};
        int[] denum = {2, 0, 4, 8};

        for (int j = 0; j < num.length; j++) {
            try {
                if (num[j] % 2 != 0) {
                    throw new NotIntResultException(num[j], denum[j]);
                }

                System.out.println(num[j]
                        + "/"
                        + denum[j]
                        + " = "
                        + num[j] / denum[j]);

            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Перехваченное исключение: " + e);
            } catch (NotIntResultException e) {
                System.out.println(e);

            }
        }
    }
}