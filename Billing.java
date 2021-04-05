package Billing;
public class Billing {
    public static void main(String[] args) {
        //Invoking from Java Class obj
        MethodBilling obj = new MethodBilling();
        
        //Price Parameter
        System.out.println(obj.computeBill(10));
        //Price, Quant Paramters
        System.out.println(obj.computeBill(10, 2));
        //Price, Quant, Value Parameters
        System.out.println(obj.computeBill(10, 20, 50));
    }
}