package JavaData;
import java.util.*;
public class UserGetInfo {
    
    public static void main(String[] args) {
    //Declaration of Variables
        String name;
        float studentno;
        String course;
        int units;
        float tuition;
    
        Scanner Index = new Scanner (System.in); //Scanner, Reads input
        //Input Process
        System.out.println("Please enter your Name: ");
        name = Index.nextLine(); //Var Name as String Input
    
        System.out.println("Please enter your Student No.: ");
        studentno = Index.nextFloat(); //Var studentno as Integer Input 
    
        System.out.println("Please enter your Course: ");
        course = Index.next(); //Var course as String Input
    
        System.out.println("Please enter your Total Units Enrolled: ");
        units = Index.nextInt();
    
        System.out.println("Please enter your Tuition: ");
        tuition = Index.nextFloat(); //Var tuition as Interger Input

        //Outputs of the Scanner Input
        System.out.println("\nYour name is: " + name);
        System.out.println("Student Number is: " + studentno);
        System.out.println("Your Course is: " + course);
        System.out.println("Your Total no. of units enrolled: " + units);
        System.out.println("Total amount of tuition fee: " + tuition);
    }
    
}
