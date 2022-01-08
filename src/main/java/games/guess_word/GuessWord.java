package games.guess_word;

import java.io.IOException;

public class GuessWord {
    public static void main(String[] args) throws IOException {
        char guessWord, myWord = 'd';
        int count = 0;

        while (count < 5) {
            guessWord = (char) System.in.read();

            if (myWord == guessWord) {
                System.out.println("Счастливчик, угадал!");
                break;

            } else {
                System.out.println("Не угадал, попробуй еще");
//                if (guessWord  < myWord ) {
//                    System.out.println("буква ближе к началу алфавита");
//                } else {
//                    System.out.println("буква ближе к концу алфавита");
//                }
            }
            count++;
        }
    }
}
