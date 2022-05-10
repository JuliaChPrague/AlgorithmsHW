import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeakElementTest {

    //Test Data:
//    {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    @Test
    public void testPeakElementHappyPath(){
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};

        int[] expectedResult = {3, 7, 23};
        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testPeakElementHappyPathNegative(){
        int[] array = {- 3, 2, - 7, 5, 1, - 9, 23, 1};

        int[] expectedResult = {2, 5, 23};
        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testPeakElementHappyPathZero(){
        int[] array = {- 3, 2, - 7, 0, 1, - 9, 23, 0};

        int[] expectedResult = {2, 1, 23};
        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testPeakElementHappyPathDuplicate(){
        int[] array = {3, 3, 5, 3 ,3};

        int[] expectedResult = {5};
        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testPeakElementHappyPathSameNumbers(){
        int[] array = {3, 3, 3, 3 ,3};

        int[] expectedResult = {};
        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
