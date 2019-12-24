public class main {

    public static void main(String[] args) {

        double CentimeterAmount = calcFeetAndInchesToCentimeters(12, 12);
        System.out.println("The amount of Centimeters is " + CentimeterAmount);
        calcFeetAndInchesToCentimeters(100);

    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double feetToInches =  (feet * 12) + inches;
        double feetToCentimeters = feetToInches * 2.54;
        if(feet >= 0 && inches >=0 && inches <= 12) {
            System.out.println(feetToCentimeters);
            return feetToCentimeters;
        } else  {
            System.out.println("invalid number");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }



}

