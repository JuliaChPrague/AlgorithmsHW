import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    //Test Data:
//            89, 89
//    Expected result: 0
//            -89, 89
//    Expected result: -1
//            89, -89
//    Expected result: 1

    @Test
    public void areNumberEqualHappyPathSameNumbers() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void areNumberEqualHappyPathNegativePositive() {
        int a = - 89;
        int b = 89;
        int expectedResult = - 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void areNumberEqualHappyPathPositiveNegative() {
        int a = 89;
        int b = - 89;
        int expectedResult = 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
