package LetterWritter;
public class FormLetterWritter {
    public static void main(String[] args) {
        //Invoking from Java Class obj
        LetterWritter obj = new LetterWritter();
      
       //Last Name Parameter
       obj.displaySalutation("Smith");
       obj.Letter(); //Prints Thank you for your recent order.
       
       //First and Last Name Parameter
       obj.displaySalutation("Scott", "Smith");
       obj.Letter(); //Prints Thank you for your recent order.
    }   
}