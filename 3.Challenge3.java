package challenges;

import java.util.Random;
import java.util.Scanner;

public class Challenge_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int daysUntilParty = random.nextInt(30);  // Random number from 0 to 29
        Scanner in = new Scanner(System.in);

        System.out.println("How many tickets would you like?");
        int ticketCount = in.nextInt();

        // Check if ticket count is valid
        if (ticketCount <= 0) {
            System.out.println("Error: You must buy at least 1 ticket.");
            return;
        }

        // Determine ticket price
        int pricePerTicket;
        if (daysUntilParty < 1) {
            System.out.println("Too late to purchase a ticket online. Please buy at the gate.");
            return;
        } else if (daysUntilParty < 10) {
            pricePerTicket = 1500;
            System.out.println("Tickets cost Ksh 1500 each.");
        } else if (daysUntilParty < 20) {
            pricePerTicket = 1000;
            System.out.println("Tickets cost Ksh 1000 each.");
        } else {
            pricePerTicket = 750;
            System.out.println("Early bird offer: Tickets cost Ksh 750 each!");
        }

        // Apply discount
        double discount = 0;
        if (ticketCount >= 5) {
            discount = 0.10;
            System.out.println("You qualify for a 10% discount!");
        } else if (ticketCount >= 2) {
            discount = 0.05;
            System.out.println("You qualify for a 5% discount!");
        } else {
            System.out.println("You do not qualify for a discount.");
        }

        // Calculate total cost
        double totalCost = ticketCount * pricePerTicket;
        double discountAmount = totalCost * discount;
        double finalCost = totalCost - discountAmount;

        System.out.printf("Total cost after discount: Ksh %.2f%n", finalCost);
    }
}
