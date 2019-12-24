package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for ( int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("This is a prime: " + i);
            } else if (count == 3) {
                System.out.println("breakout");
                break;
            }
        }

        for ( int i = 0; i < 100; i++) {

            if (isPrime(i)) {
                System.out.println("This is a prime: " + i);
            }

            if (i == 3) {
                System.out.println("breakout");
                break;
            }
        }
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











