package ConditionElseIf;
import java.util.*;
public class EvenOdd {
    /*Main Method*/
    public static void main(String[] args) {
        //Scanner Variable = reader
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a Integer: ");
        int num = reader.nextInt(); //Reads the Input

        /*Condtion*/
        if(num % 2 == 0)
            System.out.println(num + " is an even number");
        else
            System.out.println(num + " is an odd number");
    }   
}