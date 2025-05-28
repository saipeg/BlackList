package algo._3_consecutive;

//https://leetcode.com/problems/max-consecutive-ones/description/?envType=problem-list-v2&envId=m424e3ds
public class Consecutive {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        consecutive(nums);
    }

    public static int consecutive(int[] nums) {
        int count = 0;
        int result = 0;

        for(int num: nums) {
            if (num == 1) {
                count++;
                result = Math.max(count,result);
            } else {
                count = 0;
            }
        }

        System.out.println(result);
        return result;

    }
}
