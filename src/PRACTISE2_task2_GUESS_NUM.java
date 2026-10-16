import java.util.Scanner;

public class PRACTISE2_task2_GUESS_NUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secret = 8;
        int maxAttempts = 5;
        int attempts = 0;
        boolean guessed = false;

        while (attempts < maxAttempts && guessed == false) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secret) {
                guessed = true;
            } else if (guess < secret) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (guessed) {
            System.out.println("Correct!");
            System.out.println("You needed " + attempts + " attempts.");
        } else {
            System.out.println("Game over!");
            System.out.println("The secret number was " + secret);
        }

        scanner.close();
    }
}