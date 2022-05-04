public class MinMaxAve {

//    Написать алгоритм MinMaxAve, который принимает массив чисел int[] и 2 значения индексов.
//    Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
//    и среднее среди всех значений между 2-мя индексами.
//    Test Data:
//   ({10, 20, 30, 40, 50, 60, 70, 80}, 2, 6) →  {3, 7, 5}

    public int[] minMaxAve(int[] array, int indexA, int indexB) {
        if (indexA < array.length && indexB < array.length) {

                int min = Integer.MAX_VALUE;
                int max = array[indexA];
                int sum = 0;
                int count = 0;
                for (int i = indexA; i <= indexB; i++) {
                    sum += array[i];
                    count++;
                    if (array[i] < min) {
                        min = array[i];
                    }
                    if (array[i] > max) {
                        max = array[i];
                    }
                }
                return new int[]{min, max, sum / count};
            } else {
                return new int[]{};
            }
        }
    }




