import java.sql.SQLOutput;

public class LeapYear {

//    public static boolean isLeapYear(int year) {
//        int isItLeapYear = year % 4;
//        int isItLeapYear2 = year % 100;
//        int isItLeapYear3 = year % 400;
//
//        if(year <= 1 || year > 9999){
//            System.out.println("It is not a leap year");
//            return false;
//            } else if((isItLeapYear == 0) && (isItLeapYear2 != 0) || isItLeapYear3 == 0) {
//            System.out.println("It is a leap year");
//            return true;
//        } else {
//            System.out.println("Not a leap year");
//            return false;
//        }
//
//    }

    public static boolean isLeapYear ( int year) {
        int year1 = year % 4;
        int year2 = year % 100;
        int year3 = year % 400;
        if(year <=1 || year > 9999) {
            System.out.println("false");
            return false;
        } else if (year1 == 0 && year2 != 0) {
            System.out.println("true");
            return true;
        } else if (year3 == 0) {
            System.out.println("return true");
            return true;
        } else {
            System.out.println(" false ");
            return false;
        }
    }

}
