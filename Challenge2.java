package challenges;
public class Challenge_3 {

    int age = 24;

    public void AgeChecker() {
      
        if (age < 0) {
            System.out.println("Can't be possible");
        } else if (age < 18) {
            System.out.println("You are too young to enter");
        } else {
            System.out.println("You are old enough to enter");
        }
    }

    public static void main(String[] args) {
        new Challenge_3().AgeChecker();  
    }
}
