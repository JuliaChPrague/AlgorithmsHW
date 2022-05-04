public class BiggerValue {

//    Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
//    Test Data:
//            3333, 9999
//    Expected Result = 9999

    public int biggerValue(int a, int b) {
        int max;
        if (a == b) {

            return 0;
        }
            if (a > b) {
                max = a;
            } else {
                max = b;
            }
            return max;
        }
    }

