public class exceptions {
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
