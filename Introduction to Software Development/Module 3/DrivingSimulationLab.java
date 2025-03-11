import java.util.Scanner;

// DrivingSimulation class implements the Driving Simulation which includes various actions like turn the engine on/off, accelerate (i.e. increase the speed) and apply the breaks.
public class DrivingSimulationLab {

    public static String gear = "P";
    public static int speed = 0;
    public static boolean isEngineOn = false;
    public static Scanner keyBoard = new Scanner(System.in);

    public static void startSimulation() {
        boolean displayMenu = true;
        
        while (displayMenu) {
            displayDashboard();
            int choice = getUserChoice();
            processChoice(choice);
            System.out.println();
        }
    }

    public static void displayDashboard() {
        System.out.println("------ Car Dashboard ------");
        System.out.println("Speed: " + speed);
        System.out.println("Engine: " + (isEngineOn ? "On" : "Off"));
        System.out.println("Gear: " + gear);

        System.out.println("Menu:");
        System.out.println("1. Turn on/off the engine");
        System.out.println("2. Change gear (P, D, R)");
        System.out.println("3. Accelerate");
        System.out.println("4. Brake");
        System.out.println("5. Exit");
    }

    public static int getUserChoice() {
        System.out.print("Enter your choice: ");
        return keyBoard.nextInt();
    }

    public static void processChoice(int choice) {
        switch (choice) {
            case 1:
                toggleEngine();
                break;
            case 2:
                changeGear();
                break;
            case 3:
                accelerate();
                break;
            case 4:
                brake();
                break;
            case 5:
                exitSimulation();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void toggleEngine() {
        isEngineOn = !isEngineOn;
    }

    public static void changeGear() {
        if (isEngineOn) {
            System.out.print("Enter gear (P, D, R): ");
            String newGear = keyBoard.next();
            if (newGear.equals("P") || newGear.equals("D") || newGear.equals("R")) {
                gear = newGear;
                System.out.println("Gear changed to: " + gear +"\n");
            } else {
                System.out.println("Invalid gear.\n");
            }
        } else {
            System.out.println("The engine is off, turn it on first.\n");
        }
    }

    public static void accelerate() {
        if (isEngineOn && !gear.equals("P")) {
            speed += 10;
            System.out.println("Accelerated!\n");
        } else {
            System.out.println("Cannot accelerate while engine is off or in Park (P) gear.\n");
        }
    }

    public static void brake() {
        if (isEngineOn && speed > 5) {
            speed -= 5;
            System.out.println("Decreased speed by 5\n");
        } else {
            System.out.println("You can't brake, the engine is off or the speed is 5 or less\n");
        }
    }

    public static void exitSimulation() {
        System.out.println("The simulation ended!");
        isEngineOn = false;
        gear = "P";
        speed = 0;
    }

    public static void main(String[] args) {
        startSimulation();
    }
}