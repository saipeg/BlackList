package stepik.functional_programming;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiFunctionOperatorTest {

    private MyBiFunctionOperator biFunctionOperator;

    @Before
    public void setUp() {
        biFunctionOperator = MyBiFunctionOperator.getInstance();
    }

    @Test
    public void compareNums_whenGivenSevenAndSix_thenReturnsSix() {
        //given
        int first = 6;
        int second = 7;
        //when
        int result = biFunctionOperator.function.apply(first, second);

        //then
        assertEquals(6, result, "Problem from first test");

    }

}