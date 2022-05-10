import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {
//    {2, 7, 3, 10} → {10, 3, 7, 2}

    @Test
    public void testReverseArrayHappyPath() {
        int[] array = {2, 7, 3, 10};

        int[] expectedResult = {10, 3, 7, 2};
        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayHappyPathSameNumber() {
        int[] array = {2, 2, 2, 2};

        int[] expectedResult = {2, 2, 2, 2};
        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayHappyPathZero() {
        int[] array = {0, 0, 0, 0};

        int[] expectedResult = {0, 0, 0, 0};
        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testReverseArrayEmptyArray() {
        int[] array = {};

        int[] expectedResult = {};
        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayNegativeNumbers() {
        int[] array = {- 2, 8, -1, 2, 6};

        int[] expectedResult = {6, 2, - 1, 8, - 2};
        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}

