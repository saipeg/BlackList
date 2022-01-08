package games.guess_word;

import java.io.IOException;

public class GuessWord {
    public static void main(String[] args) throws IOException {
        char ch, ignore, myWord = 'd';
        do {
            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.println("Попробуй угадать: ");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == myWord) {
                System.out.println("Счастливчик, угадал!");
            } else {
                System.out.println("Не угадал, попробуй еще");
//                if (guessWord  < myWord ) {
//                    System.out.println("буква ближе к началу алфавита");
//                } else {
//                    System.out.println("буква ближе к концу алфавита");
//                }
            }

        } while (myWord != ch);
    }
}
