package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEfimchik {
    public static void main(String[] args) {

        int[] a = {458, 23311, 333, 543, 567, 876, 642};
//        int[] b = Arrays.copyOf(a, a.length);
//        Arrays.fill(a, 34);

        int target = 458;
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                index = i;
                System.out.println(index);
                break;
            }
        }

        //binarySearch

        int[] b = {458, 23311, 333, 543, 567, 876, 642};
        Arrays.sort(b);
        int target2 = 642;
        int index2 = Arrays.binarySearch(b, target2);
        System.out.println(index2);

        //2x3 array
        int[][] c = {
                {458, 23311, 333, 543, 567, 876, 642},
                {331, 441, 333, 44, 567, 876, 411},
                {458441}
        };

        Arrays.sort(c, new Comparator<int[]>() {
            @Override
            public int compare(final int[] o1, final int[] o2) {
                return Integer.compare(o1.length, o2.length);
            }
        });
        System.out.println(Arrays.deepToString(c));


//        b[2] = 38421;


//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//        System.out.println(a == b); //link type
//        System.out.println(Arrays.equals(a, b));

    }
}
