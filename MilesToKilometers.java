package Looping;
public class MilesToKilometers {
    public static void main(String[] args) {
       //Declared Variables
       final double MILE_PER_KM = 1.609;
       
       System.out.println("Miles -----------> Kilometers");
       //While loop until M of 10, until the Loop Terminates.
       for (int x = 1; x <= 10; x++)
       {
           System.out.printf("%-12d%15.3f\n", x,(x * MILE_PER_KM));
       }
    } 
}
