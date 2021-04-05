package Billing;
public class MethodBilling {
    
    //computeBill Method with One Arguement
    public static double computeBill(double Price)  
    {
        double taxes = 0.08*Price;
        return Price+taxes;
    }
    
    //computeBill Method with Two Arguements
    public static double computeBill(double Price, int quant) 
    {
        double taxes = 0.08*(Price*quant);
        return (quant*Price)+taxes;
    }
    
    //computeBill Method with Three Arguement
    public static double computeBill(double Price, int quant,double value) 
    {
        double taxes = 0.08*(Price*quant);
        return ((quant*Price)+taxes)-value;
    }
}
