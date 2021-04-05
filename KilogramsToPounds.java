package Looping;
public class KilogramsToPounds {
    public static void main(String[] args) {
        //Declared Variables
        final double POUNDS_PER_KG = 2.2;   
        System.out.println("Kilograms -----------> Pounds");   
        //While loop until KG of 199, until the Loop Terminates.
        for (int x = 1; x <= 199; x += 2) 
        {
            System.out.printf(
                 "%-12d%15.1f\n", x, (x * POUNDS_PER_KG));  
        }
    }
}
