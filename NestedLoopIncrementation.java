package Looping;
public class NestedLoopIncrementation {
    public static void main(String[] args) {     
        //Increments the Variable X until to 5, but nested
        for (int x = 1; x <= 5; x++) 
       {
        for (int y = 1; y <= x; y++) 
        {
            System.out.print(y + " ");
        }
            System.out.println();//Acts as a Blank Space per output
       }
    }    
}
