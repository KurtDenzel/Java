package JavaMethods;
import java.util.*;
public class NumbersDemo2 {
    //Main method holds two integers variables
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please Enter First Number");
    int FirstNumber = input.nextInt(); //Holds the first number
    
    System.out.println("Please enter second number");
    int SecondNumber = input.nextInt(); //Holds the Second Number
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
    System.out.println("Twice of " + number + ": " + 2 * number);
    }
    //Outputs the First & Second Number with Plus Five
    private static void displayNumberPlusFive(int number) {
    System.out.println(number + " plus five(5): " + (number + 5));
    }
    //Outputs the Squared of the First & Second Number
    private static void displayNumberSquared(int number) {
    System.out.println(number + " squared: " + (number*number));
    }
}