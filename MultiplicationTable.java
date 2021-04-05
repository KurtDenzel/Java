package Looping;
public class MultiplicationTable {
    public static void main(String[] args) {
    int a;
    int b;
        for (a = 1; a <= 9; ++a) {
            for (b = 1; b <= 9; ++b) {
            System.out.printf("%4d", (a*b)); //Multiplies for Table
            }
            System.out.println();
        }
   }
}
