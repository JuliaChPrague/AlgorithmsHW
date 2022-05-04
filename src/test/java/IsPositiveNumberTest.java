import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

//    Проверьте работу метода на числах 555, 0 и -555.

    @Test
    public void testIsPositiveNumberHappyPathPositiveNumber() {
        int x = 555;
        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumber(x);

        Assertions.assertTrue(expectedResult, String.valueOf(actualResult));
    }

    @Test
    public void testIsPositiveNumberHappyPathNull() {
        int x = 0;
        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumber(x);

        Assertions.assertTrue(expectedResult, String.valueOf(actualResult));
    }

    @Test
    public void testIsPositiveNumberHappyPathNegative() {
        int x = -555;
        boolean expectedResult = false;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumber(x);

        Assertions.assertFalse(expectedResult, String.valueOf(x));
    }

    @Test
    public void testIsPositiveNumberBounderValuePositive() {
        int x = Integer.MAX_VALUE;
        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumber(x);

        Assertions.assertTrue(expectedResult, String.valueOf(actualResult));
    }

    @Test
    public void testIsPositiveNumberBounderValueNegative() {
        int x = Integer.MIN_VALUE;
        boolean expectedResult = false;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumber(x);

        Assertions.assertFalse(expectedResult, String.valueOf(actualResult));
    }
}
