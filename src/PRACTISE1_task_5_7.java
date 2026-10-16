import java.util.Scanner;

public class PRACTISE1_task_5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Task 5: even numbers from 1 to n
        System.out.println();
        System.out.println("Task 5: even numbers");

        System.out.println("while:");
        int a = 1;
        while (a <= n) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            a++;
        }
        System.out.println();

        System.out.println("do-while:");
        int b = 1;
        do {
            if (b % 2 == 0) {
                System.out.print(b + " ");
            }
            b++;
        } while (b <= n);
        System.out.println();

        System.out.println("for:");
        for (int c = 1; c <= n; c++) {
            if (c % 2 == 0) {
                System.out.print(c + " ");
            }
        }
        System.out.println();

        // Task 6: odd numbers from 1 to n
        System.out.println();
        System.out.println("Task 6: odd numbers");

        System.out.println("while:");
        int d = 1;
        while (d <= n) {
            if (d % 2 != 0) {
                System.out.print(d + " ");
            }
            d++;
        }
        System.out.println();

        System.out.println("do-while:");
        int e = 1;
        do {
            if (e % 2 != 0) {
                System.out.print(e + " ");
            }
            e++;
        } while (e <= n);
        System.out.println();

        System.out.println("for:");
        for (int f = 1; f <= n; f++) {
            if (f % 2 != 0) {
                System.out.print(f + " ");
            }
        }
        System.out.println();

        // Task 7: FizzBuzz from 1 to 20
        System.out.println();
        System.out.println("Task 7: FizzBuzz");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}