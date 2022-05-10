import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAveHappyPath(){

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int indexA = 2;
        int indexB = 6;

        int[] expectedResult = {3, 7, 5};
        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveEmptyArr(){

        int[] array = {};
        int indexA = 2;
        int indexB = 6;
        int[] expectedResult = new int[]{};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveZeroArr(){

        int[] array = {0, 0, 0, 0, 0, 0, 0};
        int indexA = 2;
        int indexB = 6;

        int[] expectedResult = {0, 0, 0};
        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexABiggerThanIndexB(){

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int indexA = 6;
        int indexB = 2;

        int[] expectedResult = {};
        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexIndexZero(){

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int indexA = 0;
        int indexB = 0;

        int[] expectedResult = {1, 1, 1};
        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexNegative(){

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int indexA = -2 ;
        int indexB = 6;

        int[] expectedResult = new int[]{};
        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexBBiggerThanArrNegative(){

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int indexA = 2;
        int indexB = 8;

        int[] expectedResult = new int[]{};
        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testMinMaxAveIndexAIndexZero(){

        int[] array = {1};
        int indexA = 0;
        int indexB = 0;

        int[] expectedResult = {1, 1, 1};
        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndeAEquelsIndexB(){

        int[] array = {2, 3, 7, 10};
        int indexA = 3;
        int indexB = 3;

        int[] expectedResult = {10, 10, 10};
        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
