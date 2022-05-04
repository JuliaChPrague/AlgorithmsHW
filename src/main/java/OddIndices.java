public class OddIndices {

//    Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив
//    значений нечетных индексов
//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}

    public int[] oddIndices(int[] array) {
        if (array.length != 0) {

            int[] arrayOdd = new int[array.length / 2];
            int j = 0;
            for (int i = 1; i < array.length; i += 2) {

               // if (i % 2 != 0) {
                    arrayOdd[j] = array[i];

                    j++;
           //     }
            }
            return arrayOdd;
        }
        return new int[]{};
    }
}
