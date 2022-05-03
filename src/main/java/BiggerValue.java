public class BiggerValue {

//    Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
//    Test Data:
//            3333, 9999
//    Expected Result = 9999

    public int biggerValue(int a, int b) {
        int max;
        if (a != b) {
            if (a > b) {
                max = a;
                return max;
            } else {
                max = b;
                return max;
            }
        }
        return 0;
    }
}
