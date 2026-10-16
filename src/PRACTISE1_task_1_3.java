import java.util.Scanner;

public class PRACTISE1_task_1_3 {
    public static void main(String[] args) {

        // Task 1: while loop (i <= 1000, multiply i by 10)
        System.out.println("Task 1: while loop");
        int i = 1;
        while (i <= 1000) {
            System.out.println("Before: " + i);
            i = i * 10;
            System.out.println("After: " + i);
        }

        // Task 2: for loop with the same functionality
        System.out.println();
        System.out.println("Task 2: for loop");
        for (int j = 1; j <= 1000; j = j * 10) {
            System.out.println("Before: " + j);
            System.out.println("After: " + (j * 10));
        }

        // Task 3: print numbers from 1 to n
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Task 3. Enter n: ");
        int n = scanner.nextInt();

        // while
        System.out.println("while:");
        int a = 1;
        while (a <= n) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        // do-while
        System.out.println("do-while:");
        int b = 1;
        do {
            System.out.print(b + " ");
            b++;
        } while (b <= n);
        System.out.println();

        // for
        System.out.println("for:");
        for (int c = 1; c <= n; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        scanner.close();
    }
}