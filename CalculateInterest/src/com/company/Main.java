package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10000, at 2% interest = " + calculateInterest(10000.00, 2.0));


        for(int i=2; i <10; i++) {
            System.out.println("10000, at 2% interest = " + String.format("%.2f", + calculateInterest(10000.00, i)));

        }

        for(int i=8; i >=2; i--) {
            System.out.println("10000, at 2% interest = " + String.format("%.2f", + calculateInterest(10000.00, i)));
        }
        System.out.println("****************************");



        for ( int i = 0; i < 100; i++) {

            if (isPrime(i))  {
                System.out.println(isPrime(i));
            } else {
                System.out.println("not prime");
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }









    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for (int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }




}
