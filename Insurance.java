package Insurance;

import java.util.*;
public class Insurance {
    public static void main(String[] args) {
       Scanner sol = new Scanner(System.in);
       int CurrentYear;
       int BirthYear;
       //Input
       System.out.println("Enter current year: ");
       CurrentYear = sol.nextInt();
       //Input
       System.out.println("Enter birth year: ");
       BirthYear = sol.nextInt(); 
   
       intest client  =  new intest (BirthYear, CurrentYear);
       
       client.calcpamount();
       //Output
       System.out.println("Harrison Group life company insurance");
       System.out.println("Premium amount is $" + client.getpamount());
    }
}