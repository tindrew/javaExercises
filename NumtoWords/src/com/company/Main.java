package com.company;

public class Main {

    public static void main(String[] args) {
            numberToWords(321);
    }

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid value;");
        }
        number = reverse(number);

        while(number > 0) {
            int separateDigit = number % 10;
            number = number / 10;



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
                    System.out.println("Se;ven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }
        }

    }


    public static int reverse(int num) {
        int reversed = 0;
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
}
