package co.Andev;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(7);

    }

    public static void printDayOfTheWeek (int day) {

        int dayOfTheWeek = day;

        switch (dayOfTheWeek) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
            case 3:
                System.out.println("Thursday");
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("invalid day");
        }

        if(dayOfTheWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfTheWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfTheWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfTheWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfTheWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfTheWeek == 6) {
            System.out.println("Saturday");
        } else if (dayOfTheWeek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }


}
