import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isEngineOn = false;
        String gear = "P";
        int speed = 0;
        int choice = 0;
        Scanner keyBoard = new Scanner(System.in);

        while (choice != 5) {
            System.out.println("------ Car Dashboard ------");
            System.out.println("isEngineOn: " + isEngineOn);
            System.out.println("Speed: " + speed);
            System.out.println("Gear: " + gear);

            System.out.println("Menu:");
            System.out.println("1. Turn on/off the engine");
            System.out.println("2. Change gear (P, D, R)");
            System.out.println("3. Accelerate speed");
            System.out.println("4. Brake");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = keyBoard.nextInt();

            switch (choice) {
                case 1:
                    isEngineOn = !isEngineOn;
                    if (isEngineOn) {
                        System.out.println("The engine is now On.");
                    } else {
                        System.out.println("The engine is now Off.");
                        speed = 0;
                        gear = "P";
                    }
                    break;
                case 2:
                    if (isEngineOn) {
                        System.out.println("Enter gear (P, D, R): ");
                        String newGear = keyBoard.next();
                        if (newGear.equals("P") || newGear.equals("D") || newGear.equals("R")) {
                            gear = newGear;
                            System.out.println("Gear changed to: " + gear);
                        } else {
                            System.out.println("Invalid gear.");
                        }
                    } else {
                        System.out.println("The engine is off, turn it on first");
                    }

                    break;
                case 3:
                    if (isEngineOn && !gear.equals("P")) {
                        speed += 10;
                        System.out.println("Accelerated!");
                    } else {
                        System.out.println("Cannot accelerate while engine is off or in Park (P) gear.");
                    }
                    break;
                case 4:
                    if (isEngineOn) {
                        if (speed > 0 && !gear.equals("P")) {
                            speed -= 10;
                            System.out.println("Decreased  speed by 10");
                        } else {
                            System.out.println("The car speed is already 0 or parked!");
                        }
                    } else {
                        System.out.println("Start the car");
                    }
                    break;
                case 5:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Invalid option.");

            }

        }
        keyBoard.close();
    }
}
