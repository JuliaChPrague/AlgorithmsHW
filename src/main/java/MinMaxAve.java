public class MinMaxAve {

//    Написать алгоритм MinMaxAve, который принимает массив чисел int[] и 2 значения индексов.
//    Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
//    и среднее среди всех значений между 2-мя индексами.
//    Test Data:
//   ({10, 20, 30, 40, 50, 60, 70, 80}, 2, 6) →  {3, 7, 5}

    public int[] minMaxAve(int[] array, int indexA, int indexB) {
        if (array != null && array.length > 0 && indexA > - 1 && indexA <= indexB
                && indexB < array.length) {
            if(indexA > indexB) {
                int tmp = indexA;
                indexA = indexB;
                indexB = tmp;
            }
            int min = array[indexA];
            int max = array[indexB];
            int sum = 0;
            int aver = 0;

            for (int i = indexA; i <= indexB; i++) {
                if (array[indexA] < array[i]) {
                    max = array[i];
                }
                if (array[indexA] > array[i]) {
                    min = array[i];
                }
                sum += array[i];
            }

            aver = sum / (indexB - indexA + 1);

            int[] array1 = {min, max, aver};
            return array1;
        } else return new int[]{};
    }
}





