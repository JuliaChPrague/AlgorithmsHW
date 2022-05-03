import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    //Test Data:
//    {0, 1, 2, 3, 4, 5} → 15
//    {-7, -3} → -10

        @Test
        public void testSumArrayTestHappyPathPositiveNumbers() {
            int[] array =  {0, 1, 2, 3, 4, 5};
            int expectedResult = 15;

            SumArray sumarr = new SumArray();
            int actualResult = sumarr.sumArray(array);

            Assertions.assertEquals(expectedResult, actualResult);
        }

    @Test
    public void testSumArrayTestHappyPathNegativeNumbers() {
        int[] array =  {- 7, - 3};
        int expectedResult = - 10;

        SumArray sumarr = new SumArray();
        int actualResult = sumarr.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
