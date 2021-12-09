package arrays.copyAndWrightListExample;

import java.util.Arrays;

public class ReversArray {
    private int z;

    static public void getRevers(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        getRevers(array);
        System.out.println(Arrays.toString(array));
    }
}
