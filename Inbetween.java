package Looping;
import java.util.*;
public class Inbetween {
    public static void main(String[] args) {      
        Scanner in = new Scanner(System.in); 
        
        System.out.print("Enter an integer : ");
        int a = in.nextInt();
        
        System.out.print("Enter another integer: "); 
        int b = in.nextInt(); 

        int small = Math.min(a, b) ;
        int big = Math.max(a, b);

        System.out.println("Numbers between "+ a + " and  " + b +" include");
        
        //Output of the Numbers
        for (int i = small; i <= big; i++)
        System.out.print(i + " ");
    }
}