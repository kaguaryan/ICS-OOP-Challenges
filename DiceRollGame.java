package challenges;
import java.util.Random;
import java.util.Scanner;

public class DiceRollGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random dice = new Random();

        System.out.print("Enter your name: ");
        String playerName = input.nextLine();

        System.out.println("\nRolling the dice for " + playerName + "...\n");

        int roll1 = dice.nextInt(7); 
        int roll2 = dice.nextInt(7);
        int roll3 = dice.nextInt(7);

        int total = roll1 + roll2 + roll3;

        System.out.println("You rolled: " + roll1 + " + " + roll2 + " + " + roll3);

        if (roll1 == roll2 && roll2 == roll3) {
            System.out.println("You rolled triples! +6 bonus!");
            total= total+ 6;
        } else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
            System.out.println("You rolled doubles! +2 bonus!");
            total= total + 2;
        } else {
            System.out.println("No doubles or triples this time.");
        }

        System.out.println("Total score: " + total);

        if (total >= 15) {
            System.out.println("Congratulations, " + playerName + "! You win!");
        } else {
            System.out.println("Better luck next time, " + playerName + ".");
        }

        System.out.println("\nThanks for playing!");
    }
}
