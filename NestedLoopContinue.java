package Looping;
public class NestedLoopContinue {
    public static void main(String[] args)
    {
       for(int week = 1; week <= 3; week++)
       {        
            System.out.println("\nWeek: " + week);            
            for(int Day = 1; Day <= 7; Day++)
            {                            
               if(Day %2 != 0) //Skips 1, 3, 5
                {
                    continue;
                }
              System.out.println(" Days: " + Day);    
            }
        }
    }
}
