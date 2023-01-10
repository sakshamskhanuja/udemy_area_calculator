public class Main {
    public static void main(String[] args) {
        // Calculates the area of a circle having radius 5.
        System.out.println(area(5.0));

        // Calculates the area of a circle having radius -1.
        System.out.println(area(-1.0));

        // Calculates the area of a rectangle having length as 5 and breadth as 4.
        System.out.println(area(5.0, 4.0));

        // Calculates the area of a rectangle having length as -1 and breadth as 4.
        System.out.println(area(-1.0, 4.0));
    }

    /**
     * Calculates the area of a circle.
     */
    public static double area(double radius) {
        // Checks for invalid value.
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the area of a rectangle.
     */
    public static double area(double x, double y) {
        // Checks for invalid value.
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }
}