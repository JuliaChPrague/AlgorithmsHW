public class OddEven {

    //Task 1 Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
//    если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
//
//    Test Data:
//            -345 →  “Odd”
//            0 →  “Even”
//            222222 →  “Even”
//            2147483647 + 1 →  “Undefined”

    public int OddEven(int a) {
        int Odd = 0;
        int Even = 0;
        String text = "Undefined";
        if (a > 0 && a % 2 != 0) {
            return Odd;
        }
        if (a >= 0 && a % 2 == 0) {
            return Even;
        } else {
            System.out.println(text);
        }
        return 0;
    }


}
