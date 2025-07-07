package challenges;
public class Challenge_2 {
void CalculateAge(){
    int YOB; //year of birth
    int CY; 
    int AGE;

    YOB = 1967;
    System.out.println("Born in the year :" + YOB);

    CY = 2025;
    System.out.println("Current year is :" + CY );

    AGE = (CY - YOB);
    System.out.println("Current age is :" + AGE);

}
public static void main(String[] args) {
    (new Challenge_2()).CalculateAge();
}
    
}
