import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeOneTheRightTest {
    //Test Data:
//    {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}

    @Test
    public void testNegativeOneTheRight() {
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        NegativeOneTheRight negativeOneTheRight = new NegativeOneTheRight();
        int[] actualResult = negativeOneTheRight.negativeOneTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
