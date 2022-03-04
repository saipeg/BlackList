package stepik.functional_programming;

import java.util.Scanner;
import java.util.function.Function;

public class MailFormatSendler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wright sender");
        String sender = scanner.nextLine();
        System.out.println("Wright receiver");
        String receiver = scanner.nextLine();
        System.out.println("Wright signature");
        String signature = scanner.nextLine();

        Function<String, String> emailFormatter = text -> {
//            text.concat(sender, receiver) .split(" | }");
//            return text.concat(sender, receiver);
            return String.join("|", sender, receiver, signature);
        }; // modify the lambda expression

        System.out.println(emailFormatter.apply(scanner.nextLine()));
    }
}
