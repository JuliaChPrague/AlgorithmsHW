import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void testOddEvenHappyPathOdd() {
        int a = -345;
        String expectedResult = "Odd";

        OddEven oddev = new OddEven();
        String actualResult = oddev.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testOddEvenHappyPathNull() {
        int a = 0;
        String expectedResult = "Even";

        OddEven oddev = new OddEven();
        String actualResult = oddev.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenHappyPathEven() {
        int a = 222222;
        String expectedResult = "Even";

        OddEven oddev = new OddEven();
        String actualResult = oddev.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenHappyPathFail() {
        int a = 2147483647 + 1;
        String expectedResult = "Undefined";

        OddEven oddev = new OddEven();
        String actualResult = oddev.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
