import java.util.Random;
import java.util.Scanner;
class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfAttempts = 0;
        boolean Correctguess = false;
        System.out.println("Guess a number between 1 and 100");
        while (!Correctguess) 
        {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;
            if (userGuess < 1 || userGuess > 100)
            {
                System.out.println("Please enter a number between 1 and 100.");
            } 
            else if (userGuess < numberToGuess) 
            {
                System.out.println("Low!!Try again");
            } 
            else if (userGuess > numberToGuess) {
                System.out.println("High!!Try again.");
            } 
            else 
            {
                System.out.println("Guessed the number in " + numberOfAttempts + " attempts.");
                Correctguess = true;
            }
        }
        
        scanner.close();
    }
}