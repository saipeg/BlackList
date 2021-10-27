import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());

            int result = x / y;
            System.out.println(result);

        } catch (NumberFormatException ef) {
            System.out.println("java.util.InputMismatchException");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}