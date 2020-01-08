package com.company;

public class Main {

    public static void main(String[] args) {

            numberToWords(0);
           getDigitCount(5200);

    }

   public static int reverse(int num) {

        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num /= 10;
        }
        return reversed;
    }

    // works based on criteria
    public static int getDigitCount (int number) {

        if (number < 0) {
            return -1;
        }
        return String.valueOf(number).length();
    }



    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid value;");
        } else if(number == 0) {
            System.out.println("Zero");
        }
        int reverseNumber = reverse(number);
        int reversedCount = getDigitCount(reverseNumber);
        int originalCount = getDigitCount(number);


        while(reverseNumber > 0) {

            int separateDigit;
            separateDigit = reverseNumber % 10;
            reverseNumber  /= 10;

            switch (separateDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }
        }
        while (originalCount != reversedCount) {
            System.out.println("Zero");
            reversedCount++;
        }
    }
}

