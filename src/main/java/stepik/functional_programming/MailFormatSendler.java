package stepik.functional_programming;

import java.util.Scanner;
import java.util.function.Function;

public class MailFormatSendler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sender = scanner.nextLine();
        String receiver = scanner.nextLine();
        String signature = scanner.nextLine();

        Function<String, String> emailFormatter = text -> {
            text.split(" | }").
        }; // modify the lambda expression

        System.out.println(emailFormatter.apply(scanner.nextLine()));
    }
}
