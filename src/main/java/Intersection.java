public class Intersection {
//    Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
//    и возвращает массив общих элементов.
//
//    Test Data:
//    {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
//    {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
//    {1, 2, 4, 5, 89}, {8, 9, 45} → {}

    public int[] intersectionAlgorithm(int[] array, int[] array1) {
        if (array.length != 0 && array1.length != 0) {

            int[] array2 = new int[]{};
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array1[i]) {
                    array2[count] = array1[i];
                    count++;
                }
            }
            int[] array3 = new int[count];

            return array3;
        }
        return new int[]{};
    }
}




