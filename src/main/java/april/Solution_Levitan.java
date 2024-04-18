package april;

import java.util.*;

public class Solution_Levitan {
    public static void main(String[] args) {
//        List<Integer> randomInts = Stream.generate(new Random()::nextInt).limit(100).collect(Collectors.toList());
        List<Integer> randomInts = List.of(4, 3, 2, 7, 8, 2, 3, 1);

        System.out.println("\n GENERATED ARRAY OF INTEGERS");
        System.out.println(randomInts);

        getTwiceIfExists(randomInts);
    }

    public static void getTwiceIfExists(List<Integer> array) {
        System.out.println("\n RESULT OF WORKING getTwiceIfExists");

        Set<Integer> singleElements = new HashSet<>();
        Set<Integer> matchingElements = new HashSet<>();

        array.forEach(element -> {
            if (!singleElements.contains(element)) {
                singleElements.add(element);
            } else {
                matchingElements.add(element);
            }
        });

        System.out.println(matchingElements);

    }
}

/**
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
 * <p>
 * You must write an algorithm that runs in O(n) time and uses only constant extra space.
 * Example 1:
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [2,3]
 * <p>
 * Example 2:
 * Input: nums = [1,1,2]
 * Output: [1]
 * <p>
 * Example 3:
 * Input: nums = [1]
 * Output: []
 * <p>
 * Constraints:
 * n == nums.length
 * 1 <= n <= 10^5
 * 1 <= nums[i] <= n
 * Each element in nums appears once or twice.
 */
