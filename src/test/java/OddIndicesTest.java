import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Test
    public void testOddIndicesHappyPath() {

        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices odind = new OddIndices();
        int[] actualResult = odind.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesHappyPathZero() {

        int[] array = {0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0};

        OddIndices odind = new OddIndices();
        int[] actualResult = odind.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesEmptyArr() {

        int[] array = {};
        int[] expectedResult = {};

        OddIndices odind = new OddIndices();
        int[] actualResult = odind.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
