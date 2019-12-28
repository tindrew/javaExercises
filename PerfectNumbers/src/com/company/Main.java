package com.company;

public class Main {

    public static void main(String[] args) {
        isPerfectNumber(-1);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return false;
        }

        int num = 0;
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                num += i;
                System.out.println(num);
                if(num == number) {
                    System.out.println("perfect");
                    return true;
                }
            }
        }
        System.out.println("false");
        return false;
    }
}