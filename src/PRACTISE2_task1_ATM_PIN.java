import java.util.Scanner;

public class PRACTISE2_task1_ATM_PIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctPin = 1810;
        int attemptsLeft = 3;
        boolean access = false;

        while (attemptsLeft > 0 && access == false) {
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();

            if (pin == correctPin) {
                access = true;
            } else {
                attemptsLeft--;
                System.out.println("Incorrect PIN.");
                System.out.println("Attempts left: " + attemptsLeft);
            }
        }

        if (access) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Card blocked.");
        }

        scanner.close();
    }
}