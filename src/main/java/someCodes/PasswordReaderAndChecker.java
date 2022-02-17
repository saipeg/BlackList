package someCodes;

import java.util.Scanner;

public class PasswordReaderAndChecker {
    public static void main(String[] args) {
        String password;
        int passwordLength;
        int upperCharacterCount = 0;
        int lowerCharacterCount = 0;
        int digitCharacterCount = 0;
        char character;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, entry you password");
        if (scanner.hasNext()) {
            password = scanner.nextLine();
            passwordLength = password.length();
            if (passwordLength < 12) {
                System.out.println("Password length have to 12 or more");
            } else {
                for (int i = 0; i < passwordLength; i++) {
                    character = password.charAt(i);
                    if (Character.isUpperCase(character)) {
                        upperCharacterCount++;
                    }
                    if (Character.isLowerCase(character)) {
                        lowerCharacterCount++;
                    }
                    if (Character.isDigit(character)) {
                        digitCharacterCount++;
                    }

                }
                if (lowerCharacterCount > 1 && upperCharacterCount > 2 && digitCharacterCount > 1) {
                    System.out.println("Password is safety");
                } else {
                    System.out.println("Password is not safety");
                }
            }

        } else {
            System.out.println("not any words was entry, plz try again");
        }

    }
}
