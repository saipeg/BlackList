public class exceptions {


    public static void main(String[] args) {

        class NotIntResultExeption extends Exception {
            int a;
            int b;

            NotIntResultExeption(int a, int b) {
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
//
//        int a = 10;
//        int b = 0;
//        int result;
//        char[] alf = {'A', 'B', 'C'};
//        for (int i = 0; i < 2; i++) {

        for (int j = 0; j < num.length; j++) {
            try {

                    if (num[j] % 2 != 0) {
                        throw new NotIntResultExeption(num[j], denum[j]);
                    }

                    System.out.println(num[j]
                            + "/"
                            + denum[j]
                            + " = "
                            + num[j] / denum[j]);

//
//                if (i == 0) {
//                    result = a / b;
//                } else {
//                    alf[5] = 'X';
//                }
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Перехваченное исключение: " + e);
            } catch (NotIntResultExeption e) {
                System.out.println(e);
                ;
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;
        char[] alf = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0) {
                    result = a / b;
                } else {
                    alf[5] = 'X';
                }
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Перехваченное исключение: " + e);
            } finally {
                System.out.println("close resources");
            }
        }
    }
}
