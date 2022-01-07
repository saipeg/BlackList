package games.guess_word;

import java.io.IOException;

public class GuessWord {
    public static void main(String[] args) throws IOException {
        char myWord = 'd';

        char guessWord = (char) System.in.read();
        if (myWord == guessWord) {
            System.out.println("Счастливчик, угадал!");
        } else {
            System.out.println("Не угадал, попробуй еще");
            if (myWord < guessWord) {
                System.out.println("буква ближе к началу алфавита");
            } else {
                System.out.println("буква ближе к концу алфавита");
            }
        }
    }
}
