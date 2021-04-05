package JavaMethods;
import java.util.*;
public class MinutesConversion {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
        //Variables Operators
        int minutes;
        final double minhr = 60;
        final float minday = 1440;
        //Input
        System.out.println("Enter Minutes");
        minutes = console.nextInt(); //Assigned to be inpputed
        //Converter
        convert(minutes, minhr, minday);
    }
    public static void convert(int minutes, double minhr, float minday) {   
    //Variable Operators
    double Convertedhr;
    float Convertedday;
    //Arithmethic Operators
    Convertedhr = minutes / minhr;
    Convertedday = minutes / minday;
    //Output
    System.out.println("Minutes is approximately " + Convertedhr + " hours and " + Convertedday + "days");  
    System.out.println("Name: Kurt Denzel Calacday");
    System.out.println("Student No.: 20201125680");
    } 
}