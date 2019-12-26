public class Main {

    public static void main(String[] args) {
        isCatPlaying(false, 36);
    }

    public static boolean isCatPlaying (boolean summer, int temperature) {

        if (summer) {
            if (temperature < 25 || temperature > 45) {
                System.out.println("false");
                return false;
            } else {
                System.out.println("true");
                return true;
            }

        }
        if(!summer) {
            if (temperature >= 25 && temperature <= 35) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
}
