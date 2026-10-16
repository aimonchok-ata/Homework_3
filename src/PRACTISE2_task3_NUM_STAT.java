import java.util.Scanner;

public class PRACTISE2_task3_NUM_STAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int even = 0;
        int odd = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println();
        System.out.println("===== STATISTICS =====");
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        scanner.close();
    }
}