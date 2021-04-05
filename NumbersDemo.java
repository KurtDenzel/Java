package JavaMethods;
public class NumbersDemo {
    //Main method holds two integers variables
    public static void main(String[] args) {
    //Two integer variable
    int FirstNumber = 22;
    int SecondNumber = 69;
    //Invoking displayTwiceTheNumber on their variables
    displayTwiceTheNumber(FirstNumber);
    displayTwiceTheNumber(SecondNumber);
    //Invoking displayNumberPlusFive on their variables
    displayNumberPlusFive(FirstNumber);
    displayNumberPlusFive(SecondNumber);
    //Invoking displayNumberSquared on their variables
    displayNumberSquared(FirstNumber);
    displayNumberSquared(SecondNumber);
    }
    //Twice the Number
    private static void displayTwiceTheNumber(int number) {
    System.out.println("Twice of " + number + " : " + 2 * number);
   }
    //Outputs the First & Second Number with Plus Five
    private static void displayNumberPlusFive(int number) {
    System.out.println(number + " Plus Five(5) : " + (number + 5));
   }
    //Outputs the Squared of the First & Second Number
    private static void displayNumberSquared(int number) {
    System.out.println(number + " Squared : " + (number*number));

   }
}