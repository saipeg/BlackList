package algo._2_intersection;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {0, 2, 5, 6};

        intersection(array1, array2);
        intersection2(array1, array2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        for (int i = nums1.length - 1; i >= 0; i--) {
            for (int j = nums2.length - 1; j >= 0; j--) {
                if (nums1[i] == nums2[j]) {
                    result.add(nums1[i]);
                }
            }
        }
        System.out.println(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                result.add(nums2[j]);
                set.remove(nums2[j]); // since there can be repeating elements in nums2 --> once that element is in nums1 and in nums2 --> remove it from set
            }
        }
//convert list to array
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        return arr;

    }
}
