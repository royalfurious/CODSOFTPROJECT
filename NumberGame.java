import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAttempts = 0, wins = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            try {
                System.out.print("Enter the minimum number: ");
                int min = scanner.nextInt();
                System.out.print("Enter the maximum number: ");
                int max = scanner.nextInt();

                if (min >= max) {
                    System.out.println("Invalid range. Minimum should be less than maximum.");
                    continue;
                }

                int target = (int) (Math.random() * (max - min + 1) + min);
                int attempts = 0;

                while (true) {
                    System.out.print("Guess a number between " + min + " and " + max + ": ");
                    int guess = scanner.nextInt();
                    attempts++;

                    if (guess > target) {
                        System.out.println("Too high!");
                    } else if (guess < target) {
                        System.out.println("Too low!");
                    } else {
                        System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                        wins++;
                        break;
                    }
                }

                totalAttempts += attempts;
                double winRate = (double) wins / totalAttempts * 100;
                System.out.printf("Your win rate is %.2f%%\n", winRate);

                System.out.print("Do you want to play again (y/n)? ");
                String playAgain = scanner.next();
                if (!playAgain.equalsIgnoreCase("y")) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.next(); // Clear invalid input
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}