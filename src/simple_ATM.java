import java.util.Scanner;

public class simple_ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctPin = 1810;
        int attemptsLeft = 3;
        boolean loggedIn = false;
        double balance = 1000;

        System.out.println("===== SIMPLE ATM =====");

        // Login: maximum 3 attempts
        while (attemptsLeft > 0 && loggedIn == false) {
            System.out.print("Enter your PIN: ");
            int pin = scanner.nextInt();

            if (pin == correctPin) {
                loggedIn = true;
                System.out.println("Login successful!");
            } else {
                attemptsLeft--;
                System.out.println("Incorrect PIN.");
                System.out.println("Attempts left: " + attemptsLeft);
            }
        }

        if (loggedIn) {
            int choice = 0;

            // Menu repeats until the user selects option 4
            while (choice != 4) {
                System.out.println();
                System.out.println("===== ATM MENU =====");
                System.out.println("1. Check balance");
                System.out.println("2. Deposit money");
                System.out.println("3. Withdraw money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("Current balance: " + balance);

                } else if (choice == 2) {
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();

                    if (amount > 0) {
                        balance = balance + amount;
                        System.out.println("Deposit successful!");
                        System.out.println("Updated balance: " + balance);
                    } else {
                        System.out.println("Invalid amount. The amount must be greater than zero.");
                    }

                } else if (choice == 3) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid amount. The amount must be greater than zero.");
                    } else if (amount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance = balance - amount;
                        System.out.println("Withdrawal successful!");
                        System.out.println("Updated balance: " + balance);
                    }

                } else if (choice == 4) {
                    System.out.println("Thank you for using the Aimonchok's ATM. Goodbye!");

                } else {
                    System.out.println("Invalid option. Please choose 1, 2, 3 or 4.");
                }
            }
        } else {
            System.out.println("Your account has been blocked.");
        }

        scanner.close();
    }
}