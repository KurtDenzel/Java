package ConditionElseIf;
import java.util.*;
public class AscendingAndDescending {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Three Integers Scanned.
    System.out.print("Enter First integer: ");
    int Number1 = input.nextInt();
    
    System.out.print("Enter Second integer: ");
    int Number2 = input.nextInt();
    
    System.out.print("Enter Third integer: ");
    int Number3 = input.nextInt();

    /*Else If Conditions Greater Than*/
    if (Number1 > Number2) {
      int temp = Number1;
      Number1 = Number2;
      Number2 = temp;
    }

    if (Number2 > Number3) {
      int temp = Number2;
      Number2 = Number3;
      Number3 = temp;
    }

    if (Number1 > Number2) {
      int temp = Number1;
      Number1 = Number2;
      Number2 = temp;
    }
    
    /*Output*/
    System.out.println("-------------------");
    System.out.println("The Ascending Order: " + Number1 + " " + Number2 + " " + Number3);
    System.out.println("The Descending Order: " + Number3 + " " + Number2 + " " + Number1);
    }
}
