package streams.queez;

import java.util.Optional;

public class Quiz_4 {
    public static void main(String[] args) {
        int n = 1;
        int finalN = n;
        int result = Optional.of(n++)
                .map(i -> i + finalN) //заменил N и добавил поле finalN

                .orElse(-1);
        System.out.println(result);
    }
}
