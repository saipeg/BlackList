package arrays;

public class ForEachTest {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : numbs) {
            sum += x;
            System.out.println(sum);
        }
        System.out.println("sum = " + sum);
    }
}
