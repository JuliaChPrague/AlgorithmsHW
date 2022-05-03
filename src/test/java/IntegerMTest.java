import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerMTest {

//    If M is multiple of 3 and 5 then return "Good Number".
//    If M is only multiple of 3 and not of 5 then return "Bad Number"
//    If M is only multiple of 5 and not of 3 then return "Poor Number"
//    If M doesn't satisfy any of the above conditions then return "-1"

    @Test
    public void testIntegerMHappyPathMultipleBothNumber() {
        int m  = 15 ;
        String expectedResult = "Good Number";

        IntegerM intM = new IntegerM();
        String actualResult = intM.integerM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntegerMHappyPathMultipleThree() {
        int m  = 6 ;
        String expectedResult = "Bad Number";

        IntegerM intM = new IntegerM();
        String actualResult = intM.integerM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntegerMHappyPathMultipleFive() {
        int m  = 5 ;
        String expectedResult = "Poor Number";

        IntegerM intM = new IntegerM();
        String actualResult = intM.integerM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntegerMHappyPathNotMultiple() {
        int m  = 13;
        String expectedResult = "-1";

        IntegerM intM = new IntegerM();
        String actualResult = intM.integerM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
