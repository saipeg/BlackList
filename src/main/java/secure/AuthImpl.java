package secure;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AuthImpl {

    public static String generateSmsPassword() {

        SecureRandom random = new SecureRandom();
        int num = random.nextInt(100000);
        System.out.println("num = " + num);
        List<String> list = new ArrayList<>();
        list.add("ee");
        list.add("e2");
        System.out.println("String.format = " + String.format("%04d", list.size() + 1));
        return String.format("%05d", num); //make size to 5 symbols
    }

    public static void test() {
        String name = null;
//        name = "gee!";
        System.out.println("Name null");
        if (name == null) {
            System.out.println("Просто выйдем из метода");
            return;
        } else {
                System.out.println("Тут не налл!");
            }
    }

    public static String generatePasswordWithPolicy() {
        Random random = new Random();
        StringBuilder password = new StringBuilder(8);
        System.out.println("password = " + password);
        final String CHAR_SET = "0123456789ABCDEFGHIKLMNOPQRSTVXYZ";
        for (int i = 0; i < 3; ++i) {
            password.insert(i, new char[]{CHAR_SET.charAt(random.nextInt(CHAR_SET.length()))}, 0, 1);
        }
        return password.toString();
    }

        public static void main (String[]args){

        test();

            String password = AuthImpl.generateSmsPassword();
            System.out.println("password = " + password);

            System.out.println("========================================");

            String bigPass = AuthImpl.generatePasswordWithPolicy();
            System.out.println("bigPass = " + bigPass);
            System.out.println("length: " + bigPass.length());


        }



    }
