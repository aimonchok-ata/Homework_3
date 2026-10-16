import java.util.Scanner;

public class Storecheckout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Running total (accumulator) and total quantity of products (counter)
        int subtotal = 0;
        int itemsPurchased = 0;

        int choice = 0;

        // 1. STORE MENU
        // Repeats until the customer chooses 5 AND has bought at least one product
        while (choice != 5 || itemsPurchased == 0) {
            System.out.println("===== SIMPLE APPLE STORE =====");
            System.out.println();
            System.out.println("1. Apple Mouse     - $80");
            System.out.println("2. Apple Keyboard  - $100");
            System.out.println("3. Apple Pencil    - $150");
            System.out.println("4. AirPods         - $150");
            System.out.println("5. Checkout");
            System.out.println();
            System.out.print("Choose a product: ");
            choice = scanner.nextInt();
            System.out.println();

            if (choice >= 1 && choice <= 4) {
                // ===== 2. SELECTING A PRODUCT =====
                String name = "";
                int price = 0;

                if (choice == 1) {
                    name = "Apple Mouse";
                    price = 80;
                } else if (choice == 2) {
                    name = "Apple Keyboard";
                    price = 100;
                } else if (choice == 3) {
                    name = "Apple Pencil";
                    price = 130;
                } else {
                    name = "AirPods";
                    price = 130;
                }

                System.out.println("You selected: " + name);
                System.out.println("Price: $" + price);
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                System.out.println();

                // ===== 5. VALIDATE THE QUANTITY =====
                if (quantity > 0) {
                    int cost = quantity * price;
                    subtotal = subtotal + cost;
                    itemsPurchased = itemsPurchased + quantity;

                    System.out.println(quantity + " x $" + price + " = $" + cost);
                    System.out.println("Added to cart!");
                    System.out.println("Current total: $" + subtotal);
                } else {
                    System.out.println("Invalid quantity.");
                    System.out.println("Quantity must be greater than 0.");
                }
                System.out.println();

            } else if (choice == 5 && itemsPurchased == 0) {
                // Checkout with an empty cart: show a message and display the menu again
                System.out.println("You did not choose any product.");
                System.out.println();

            } else if (choice != 5) {
                // ===== 4. VALIDATE THE PRODUCT CHOICE =====
                System.out.println("Invalid option.");
                System.out.println("Please choose a number from 1 to 5.");
                System.out.println();
            }
        }

        // ===== 6. CHECKOUT =====
        System.out.println("===== CHECKOUT =====");
        System.out.println();
        System.out.println("Items purchased: " + itemsPurchased);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println();

        // ===== 7. DISCOUNT (10% if the subtotal is $100 or more) =====
        int discount = 0;
        if (subtotal >= 100) {
            discount = subtotal * 10 / 100;
            System.out.println("You received a 10% discount!");
        }
        int finalTotal = subtotal - discount;

        System.out.println("Discount: $" + discount);
        System.out.println("Final total: $" + finalTotal);
        System.out.println();

        // ===== 8 and 9. PAYMENT (ask again until the payment is enough) =====
        int payment = 0;
        boolean paid = false;

        while (paid == false) {
            System.out.print("Enter payment amount: $");
            payment = scanner.nextInt();
            System.out.println();

            if (payment < finalTotal) {
                System.out.println("Insufficient payment.");
                System.out.println("You still need to pay: $" + (finalTotal - payment));
                System.out.println();
            } else {
                paid = true;
            }
        }

        // ===== 10. CHANGE =====
        int change = payment - finalTotal;
        System.out.println("Payment successful!");
        System.out.println("Change: $" + change);
        System.out.println();

        // ===== 11. FINAL RECEIPT =====
        System.out.println("========================");
        System.out.println("       SIMPLE STORE");
        System.out.println("========================");
        System.out.println();
        System.out.println("Items purchased: " + itemsPurchased);
        System.out.printf("%-13s%6s%n", "Subtotal:", "$" + subtotal);
        System.out.printf("%-13s%6s%n", "Discount:", "$" + discount);
        System.out.printf("%-13s%6s%n", "Final total:", "$" + finalTotal);
        System.out.printf("%-13s%6s%n", "Payment:", "$" + payment);
        System.out.printf("%-13s%6s%n", "Change:", "$" + change);
        System.out.println();
        System.out.println("========================");
        System.out.println("Thank you for shopping!");
        System.out.println("========================");

        scanner.close();
    }
}