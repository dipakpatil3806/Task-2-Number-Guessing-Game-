import java.util.Random;
import java.util.Scanner;

public class NumguessingGame { 

    
public class GuessTheNumber {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            Random rand = new Random();

            int attempts = 0;
            int score = 0;
            boolean playAgain = true;

            System.out.println("Welcome to Guess the Number!");
            System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

            while (playAgain) {
                int numberToGuess = rand.nextInt(100) + 1; // generates a random number between 1 and 100
                int numGuesses = 0;
                boolean hasWon = false;

                while (!hasWon && numGuesses < 10) { // player has maximum of 10 attempts
                    System.out.print("Enter your guess (1-100): ");
                    int guess = input.nextInt();
                    numGuesses++;

                    if (guess < numberToGuess) {
                        System.out.println("Your guess is too low. Try again.");
                    } else if (guess > numberToGuess) {
                        System.out.println("Your guess is too high. Try again.");
                    } else {
                        hasWon = true;
                    }
                }

                if (hasWon) {
                    System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
                    score += (10 - numGuesses) * 10; // add to score based on number of attempts
                } else {
                    System.out.println("Sorry, you didn't guess the number in 10 attempts. The number was " + numberToGuess + ".");
                }

                System.out.print("Do you want to play again? (y/n): ");
                String playAgainInput = input.next();
                playAgain = playAgainInput.equalsIgnoreCase("y");
                attempts++;
            }

            System.out.println("Thanks for playing! Your score is " + score + " and you played " + attempts + " games.");
        }
    }
}
    
}


