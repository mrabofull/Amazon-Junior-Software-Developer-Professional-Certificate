import java.util.Scanner;

public class WaterStateClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter altitude (meters): ");
        int altitude = scanner.nextInt();
        
        System.out.print("Enter temperature (Celsius): ");
        int temperature = scanner.nextInt();
        
        // 1st level "if" condition - below sea level
        if (altitude < 0) {
            if (temperature <= 0) {
                System.out.println("Ice (Below Sea Level)");
            } else if (temperature < 100) {
                System.out.println("Liquid (Below Sea Level)");
            } else {
                System.out.println("Gas (Below Sea Level)");
            }
        } else {
            // At or above sea level
            if (temperature <= 0) {
                System.out.println("Ice (Above Sea Level)");
            } else if (temperature < 95) { // Water boils at lower temperature at higher altitudes
                System.out.println("Liquid (Above Sea Level)");
            } else {
                System.out.println("Gas (Above Sea Level)");
            }
        }
        
        scanner.close();
    }
}