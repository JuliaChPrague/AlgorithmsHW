import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayTest {
    //Test Data:
//    {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}

    @Test
    public void testSortArrayHappyPath(){
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayZero() {
        int[] array = {0, 0, 0};
        int[] expectedResult = {0, 0, 0};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testSortArrayEmpty() {
        int[] array = {};
        int[] expectedResult = {};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayNegativeNumber() {
        int[] array = {- 4, 3, 7, - 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {- 12, - 4, 2, 3, 4, 5, 7, 9, 12};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
