import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    //Test Data:
//            3333, 9999
//    Expected Result = 9999

    @Test
    public void testBiggerValueHappyPathPositiveNumbers() {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testBiggerValueHappyPathSameNumbers() {
        int a = 9999;
        int b = 9999;
        int expectedResult = 0;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
