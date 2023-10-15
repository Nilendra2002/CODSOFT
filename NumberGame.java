import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int maxAttempts = 5;
        int totalRounds = 0;
        int totalAttempts =0;
        System.out.println("New round! Guess the number between 1 and 100.");
        
        int randnum = rand.nextInt(100) + 1;

        
        int userGuess = 0;

        while (userGuess != randnum) {
            System.out.print("Enter your guess(between 1 and 100): ");

            try {
                userGuess = sc.nextInt();

                if (userGuess < randnum) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > randnum) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number.");
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid integer.");
                sc.nextLine();
            }
        }

        System.out.println("Game over!");
        sc.close();
    }

}