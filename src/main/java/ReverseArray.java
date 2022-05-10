import java.util.Arrays;

public class ReverseArray {
//    Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
//    и возвращает “перевернутый” массив.
//    Test Data:
//    {2, 7, 3, 10} → {10, 3, 7, 2}

    public int[] reverseArrayAlgorithm(int[] array) {

        if (array.length == 0) {
            return new int[]{};
        }
        int[] arrayRev = new int[array.length];
        for (int i = 0; i < array.length / 2; i++) {
            arrayRev[i] = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = arrayRev[i];
        }
        for (int i = 0; i < array.length; i++) {

        }

        return array;
    }
}


//    public int[] reverseArrayAlgorithm(int[] array) {
//
//        int[] result = new int[array.length];
//        int count = array.length - 1;
//
//        for (int i = 0; i < array.length; i++) {
//            result[count] = array[i];
//            count--;
//        }
//
//        return result;
//    }
//}




