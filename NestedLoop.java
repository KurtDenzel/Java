package Looping;
public class NestedLoop {
    public static void main(String[] args)
    {
        for(int week = 1; week <= 3; week++) //Loop Until it Reaches 3
        {
            System.out.println("Week: " + week);         
            for(int Day = 1; Day <= 7; Day++) //Nested to Print Days 1 - 7 for each Week
            {
                System.out.print("\nDay: " + Day);
            }    
            System.out.println("  ");
        }   
    }
}
