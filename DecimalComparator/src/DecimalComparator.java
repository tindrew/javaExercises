import java.math.BigDecimal;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double dec1, double dec2) {


        dec1 = dec1 * 1000;
        dec2 = dec2 * 1000;

        int a1 = (int) dec1;
        int a2 = (int) dec2;

        if (a1 == a2) {
            System.out.println("it works");
            return true;
        } else {
            System.out.println("it doesn't work");
            return false;
        }






//        double sum1 = dec1;
//        double sum2 = dec2;
//        double fractional1 = sum1 - (long)sum1;
//        double fractional2 = sum2 - (long)sum2;
//
//        if (fractional1 == fractional2) {
//            System.out.println("this is true");
//            return true;
//        } else {
//            System.out.println("this isn't true");
//            return false;
//        }
    }




}
