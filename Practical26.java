import java.util.Scanner;

class Payment {
    void processPayment(int amount) {
        System.out.println("Processing payment of Rs. " + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using Credit Card");
    }
}

class UPIPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}

public class Practical26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	System.out.println("250393107008");
        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("Enter amount to pay: ");
        int amount = sc.nextInt();

        Payment p; 

        if (choice == 1) {
            p = new CreditCardPayment();   // Upcasting
        } else if (choice == 2) {
            p = new UPIPayment();          // Upcasting
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        p.processPayment(amount);

        sc.close();
    }
}