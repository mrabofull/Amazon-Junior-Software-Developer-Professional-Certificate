public class Main {
    // Area of a circle = π * radius * radius
    static double radiusOfCircle;

    public static void setCircleRadius() {
        radiusOfCircle = 3.5;
    }

    public static double calculateAreaOfCircle() {
        return Math.PI * radiusOfCircle * radiusOfCircle;
    }

    public static void main(String[] args) {
        setCircleRadius();

        double areaOfCircle = calculateAreaOfCircle();

        System.out.println("Area of the circle with radius " + radiusOfCircle + " is: " + areaOfCircle);
    }
}
