import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

//    Проверьте работу метода на числах 555, 0 и -555.

    @Test
    public void isPositiveNumberHappyPathPositiveNumber() {
        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isPositiveNumberHappyPathNull() {
        int a = - 555;
        boolean expectedResult = false;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
