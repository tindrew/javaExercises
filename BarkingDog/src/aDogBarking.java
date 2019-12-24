public class aDogBarking {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking) {
            if(hourOfDay < 0 || hourOfDay > 23) {
                System.out.println("Invalid");
                return false;
            } else if (hourOfDay < 8 || hourOfDay > 22 ) {
                System.out.println("stop barking");
                return true;
            }
        }

        return false;

    }
}
