public class NegativeOneTheRight {
    //Написать алгоритм NegativeOnTheRight,который принимает на вход массив целых чисел, и возвращает массив,
//    в котором все негативные числа находятся во второй половине массива
//    Test Data:
//    {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}

    public int[] negativeOneTheRightAlgorithm(int[] array) {
        int[] arrayResult = new int[array.length];
        int count = arrayResult.length - 1;
        int count2 = 0;

        if (array.length != 0) {

            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    arrayResult[count] = array[i];
                    count--;
                } else if (array[i] > 0) {
                    arrayResult[count2] = array[i];
                    count2++;
                }
            }

            return arrayResult;
        }

        return new int[]{};
    }
}

