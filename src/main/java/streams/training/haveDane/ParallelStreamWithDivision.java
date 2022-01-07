package streams.training.haveDane;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamWithDivision {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(0.3);
        numbers.add(1.3);
        numbers.add(4.0);
        numbers.add(5.0);

        Double divisionResult = numbers.parallelStream()
                .reduce((a, b) -> a / b).get();

        System.out.println("divisionResult = " + divisionResult);
    }

}
