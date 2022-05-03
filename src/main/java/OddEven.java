import com.sun.jdi.Value;

public class OddEven {

    //Task 1 Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
//    если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
//
//    Test Data:
//            -345 →  “Odd”
//            0 →  “Even”
//            222222 →  “Even”
//            2147483647 + 1 →  “Undefined”

    public String oddEvenAlgorithm(long a) {
        String odd = "Odd";
        String even = "Even";
        String undefined = "Undefined";

        if (a <= 2147483647L && a >= -2147483647L) {
            if (a % 2 == 0) {

                return even;
            } else {

                return odd;
            }
        }

        return undefined;
    }
}
