import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void testOddEvenHappyPathOdd() {
        long a = -345;
        String expectedResult = "Odd";

        OddEven oddev = new OddEven();
        String actualResult = oddev.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenHappyPathOEvenNegative() {
        long a = -22;
        String expectedResult = "Even";

        OddEven oddev = new OddEven();
        String actualResult = oddev.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathNull() {
        long a = 0;
        String expectedResult = "Even";

        OddEven oddev = new OddEven();
        String actualResult = oddev.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenHappyPathEven() {
        long a = 222222;
        String expectedResult = "Even";

        OddEven oddev = new OddEven();
        String actualResult = oddev.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathOddPositive() {
        long a = 23;
        String expectedResult = "Odd";

        OddEven oddev = new OddEven();
        String actualResult = oddev.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testOddEvenPositiveUndefined() {
        long a = 2147483648L;
        String expectedResult = "Undefined";

        OddEven oddev = new OddEven();
        String actualResult = oddev.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddEvenNegativeUndefined() {
        long a = - 2147483649L;
        String expectedResult = "Undefined";

        OddEven oddev = new OddEven();
        String actualResult = oddev.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
