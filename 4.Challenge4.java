package challenges;
import java.util.Scanner;

public class Challenge_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mark;

        do {
            System.out.println("What is your score?");
            mark = input.nextInt();

            if (mark < 70) {
                System.out.println("Not a pass");
            }

        } while (mark < 70); 

        System.out.println("Congratulations"); 
    }
}
