package searsh.buble_search;

import java.util.Arrays;

public class BubbleSearch {
    public static void main(String[] args) {
        int[] nums = {1, 44, -31, 544, -45, 4, 130, 14};
        int temp;
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j - 1] > nums[j]) {
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(nums));

    }
}
