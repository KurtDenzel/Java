package Looping;
import java.util.*;        
public class BarChart {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     //Declare Variables
        int Number1 = 0;
        int Number2 = 0;
        int Number3 = 0;
        int Number4 = 0;
        int Number5 = 0;
        int i = 1;
        /*Art*/
        System.out.println("Enter Points Scored by Art: ");
        Number1 = input.nextInt();
        /*Bob*/
        System.out.println("Enter Points Scored by Bob: ");
        Number2 = input.nextInt();
        /*Cal*/
        System.out.println("Enter Points Scored by Cal: ");
        Number3 = input.nextInt();
        /*Dan*/
        System.out.println("Enter Points Scored by Dan: ");
        Number4 = input.nextInt();
        /*Eli*/
        System.out.println("Enter Points Scored by Eli: ");
        Number5 = input.nextInt();
        
        System.out.print("\nPoints for Game\n");
        for(i = 1; i <= Number1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for(i = 1; i <= Number2; i++) {
            System.out.print("*");
        }
        System.out.println();

        for(i = 1; i <= Number3; i++) {
            System.out.print("*");
        }
        System.out.println();

        for(i = 1; i <= Number4; i++) {
            System.out.print("*");
        }
        System.out.println();

        for(i = 1; i <= Number5; i++) {
            System.out.print("*");
        }
        System.out.println(); 
        input.close();
    }
}   