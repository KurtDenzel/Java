package LetterWritter;
public class LetterWritter {
   
   //String Method Argument
   static void displaySalutation(String LastName)          
   {
       System.out.println("Dear Mr. or Ms. " + LastName);
   }
   
   //String Method Argument
   static void displaySalutation(String FirstName, String LastName) 
   {
       System.out.println("Dear " + FirstName + " " + LastName);
   }
   
   //String Method
   public static void Letter()
   {
       System.out.println("Thank you for your recent order.");
   }
}