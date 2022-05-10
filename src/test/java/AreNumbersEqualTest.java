import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void testAreNumberEqualHappyPathSameNumbers() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumberEqualHappyPathNegativePositive() {
        int a = - 89;
        int b = 89;
        int expectedResult = - 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testAreNumberEqualHappyPathPositiveNegative() {
        int a = 89;
        int b = - 89;
        int expectedResult = 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
