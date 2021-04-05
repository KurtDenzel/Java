package JavaMethods;
import java.util.*;
public class QuartsofGallon {
    public static void main(String[] args) {
        Scanner dejar = new Scanner(System.in);
        //Variables Operators
        final int QuartsGallon = 4;
        int QuartsNeeded;
   
        //Input
        System.out.println("Enter number of quarts");
        QuartsNeeded = dejar.nextInt(); //Assigned to be inpputed
        //Converter
        convert(QuartsNeeded, QuartsGallon);
    }
    public static void convert(int QuartsNeeded, int QuartsGallon) {   
        
    //Variable Operators
    int ConvertedGallon;
    int ConvertedRemainder;
    //Arithmethic Operators
    ConvertedGallon = QuartsNeeded / QuartsGallon;
    ConvertedRemainder = QuartsNeeded % QuartsGallon;
    //Output
    System.out.println("A Job that needs " + QuartsNeeded + " quarts requires " + ConvertedGallon + " gallons plus " + ConvertedRemainder + " quarts.");  
    System.out.println("Name: Kurt Denzel Calacday");
    System.out.println("Student No.: 20201125680");
    } 
}
