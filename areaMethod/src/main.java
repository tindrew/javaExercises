public class main {
    public static void main(String[] args) {
        area(5.0);
        area(-1.0, 4.0);
    }

    public static double area (double radius) {
        if(radius < 0) {
            System.out.println("invalid parameter");
            return -1.0;
        }
        double myRadius = radius * radius * Math.PI;
        System.out.println(myRadius);
        return myRadius;
    }

    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            System.out.println("invalid value");
            return -1.0;
        }
        double areaRect = x * y;
        System.out.println(areaRect);
        return areaRect;
    }

}


