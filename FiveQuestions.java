package Looping;
import java.util.*;
public class FiveQuestions {
    public static void main(String[] args) {
        //Declared Variables
        final int NoofQuestions = 4;
        int Correctcount = 0;
        int count = 0;
        long StartTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);
        
        while (count <= NoofQuestions){
            int Num1 = (int)(Math.random()*10);
            int Num2 = (int)(Math.random()*10);
            
            int temp = Num1;
            Num1 = Num2;
            Num2 = temp;
                    
            System.out.println("What is " + Num1 + "-" + Num2 + "? ");
            int Answer = input.nextInt();
                         
            if(Num1 - Num2 == Answer)
            {
                System.out.println("You are correct!");
                Correctcount++;
            }
            else            
                System.out.println("You are wrong\n" + Num1 + " - "
                        + Num2 + " should be " + (Num1 - Num2) );     
            count++;
            
            output += " \n" + Num1 + " - " + Num2 + " = " + Answer +
                    ((Num1 - Num2 == Answer)? " correct" : " wrong");   
        }
        
        long endTime = System.currentTimeMillis();
        long testTime = endTime - StartTime;
        //Correct Count and CurentTimeMillis
        System.out.println("Correct count is " + Correctcount + 
            "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }   
}