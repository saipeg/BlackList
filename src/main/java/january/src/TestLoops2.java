
import java.util.*;
import java.io.*;

public class TestLoops2 {

    public static void main(String[] args) {

        List<List<Integer>> lists = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double y = 0;
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                double v = b * Math.pow(2, j);
                y = v + y;
                list.add(a + (int) y);
            }
            lists.add(list);
        }
        in.close();

        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
        System.out.println(Thread.currentThread());
    }
}
