package Looping;
public class Factorials {
    public static void main(String[] args) {
        //Declare Variables
        int i;
        int Factorial = 1;  
        for(i=1;i<=10;i++)
        {    
        //Operations
        Factorial = Factorial * i;
        System.out.println("Factorial of "+ i +" is: "+ Factorial); //Output
        }    
    }
}
