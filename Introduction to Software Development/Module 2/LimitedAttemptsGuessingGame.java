import java.util.Scanner;
import java.util.Random;

public class LimitedAttemptsGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 50
        int secretNumber = random.nextInt(50) + 1;  
        int userGuess = 0;
        int attemptsLeft = 5;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 50. You have 5 attempts to guess it.");

        while (attemptsLeft > 0) {
            System.out.print("Guess the number: ");
            userGuess = scanner.nextInt();

            // Check if the guess is correct
            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else {
                attemptsLeft--;

                if (userGuess < secretNumber) {
                    System.out.println("Too low! You have " + attemptsLeft + " attempts left.");
                } else {
                    System.out.println("Too high! You have " + attemptsLeft + " attempts left.");
                }

                if (attemptsLeft == 0) {
                    System.out.println("Sorry, you've run out of attempts! The correct number was " + secretNumber + ".");
                }
            }
        }

        scanner.close();
    }
}
