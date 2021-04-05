package Looping;
public class NestedLoopBreak {
    public static void main(String[] args)
    {
        for(int week = 1; week <= 3; week++)
        {        
            System.out.println("\nWeek: " + week);
            
            for(int Day = 1; Day <= 7; Day++)
            {               
               if(week ==2) //Skips Week 2 Days, But Prints it out anyways
                {
                    break;
                }
              System.out.println(" Days: " + Day);
            }
        }
    }
}
