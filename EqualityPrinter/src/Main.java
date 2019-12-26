public class Main {
    public static void main(String[] args) {
        printEqual(9, 9, 8);
    }
    public static void printEqual (int sum1, int sum2, int sum3) {
        if (sum1 < 0 || sum2 < 0 || sum3 < 0) {
            System.out.println("Invalid Value");
        } else if (sum1 == sum2 && sum3 == sum1) {
            System.out.println("All numbers are equal");
        } else if (sum1 != sum2 && sum1 != sum3 && sum2 != sum1 && sum2 != sum3 && sum3 != sum1 && sum3 != sum2) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
