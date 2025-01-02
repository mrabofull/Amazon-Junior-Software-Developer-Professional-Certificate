import java.util.Scanner;
import java.util.Random;

public class RandomGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 20
        int secretNumber = random.nextInt(20) + 1;  
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 20. Try to guess it!");

        while (userGuess != secretNumber) {
            System.out.print("Guess the number: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
        scanner.close();
    }
}
