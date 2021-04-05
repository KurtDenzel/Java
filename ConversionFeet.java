package JavaData;
import java.util.*;
public class ConversionFeet {
    static Scanner console = new Scanner(System.in);
    public static void main (String [] args){
        
        System.out.print("Enter Feet: ");
        double Feet=console.nextInt();  
        
        System.out.print("Enter Inches: ");
        double Inch=console.nextInt();
        
        double SumInch = Feet * 12 + Inch;
        double SumCenti = SumInch * 2.54;
        
        //Output 
        System.out.println("The Number you entered are " + Feet  + " for Feet and " + Inch + "for Inches.");
        System.out.println("The Total number of inches: " + SumInch);
        System.out.println("The Total number of centimeters: " + SumCenti);
    }
}
