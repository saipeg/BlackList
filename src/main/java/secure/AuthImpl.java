package secure;

import java.security.SecureRandom;

public class AuthImpl {

    public static String generateSmsPassword() {

        SecureRandom random = new SecureRandom();
        int num = random.nextInt(100000);
        System.out.println("num = " + num);
        return String.format("%05d", num); //make size to 5 symbols
    }

    public static void main(String[] args) {

        String password = AuthImpl.generateSmsPassword();
        System.out.println("password = " + password);

    }

}
