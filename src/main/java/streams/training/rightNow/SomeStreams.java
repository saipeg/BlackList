package streams.training.rightNow;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SomeStreams {
    public static void main(String[] args) {

        int[] nums = {1, 33, 6, 44,-1, 44};

        nums = Arrays.stream(nums)
                .filter(x -> x > 0)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(nums));


    }
}
