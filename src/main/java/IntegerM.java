public class IntegerM {

//    Given an integer M perform the following conditional actions:
//    If M is multiple of 3 and 5 then return "Good Number".
//    If M is only multiple of 3 and not of 5 then return "Bad Number"
//    If M is only multiple of 5 and not of 3 then return "Poor Number"
//    If M doesn't satisfy any of the above conditions then return "-1"


    public String integerM(int m) {
        String out = " ";
        if (m % 3 == 0 && m % 5 == 0) {

            return out = "Good Number";
        } else if (m % 3 == 0 && m % 5 != 0) {

            return out = "Bad Number";
        } else if (m % 3 != 0 && m % 5 == 0) {

            return out = "Poor Number";
        } else {

            return out = "- 1";
        }
    }
}
