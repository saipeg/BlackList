package algo._1_merge;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] numbs1 = new int[10];
        numbs1[0] = 1;
        numbs1[1] = 2;
        numbs1[2] = 3;
        numbs1[3] = 5;

        int[] numbs2 = {2, 4, 9};

        merge(numbs1, 4, numbs2, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;  // Указатель на конец заполненной части nums1
        int j = n - 1;  // Указатель на конец nums2
        int k = m + n - 1;  // Указатель на конец nums1 (вся длина)

        // Слияние с конца
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

}
