package ConditionElseIf;
import java.util.*;
public class TwelveDays {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
       int TwelveDays;
       
       System.out.print("Enter the day from Twelve Days of Christmas: ");
       TwelveDays = input.nextInt();
       
       //Converting int TwelveDays to Lyrics
       int Lyrics = TwelveDays;
       
       /*Switch Case Statement*/
       switch (Lyrics) {
        case 1:
            System.out.println("On the First Day of Christmas  my true love gave to me "
                    + " A partridge in a pear tree");
            return;

        case 2:
            System.out.println( "On the second day of Christmas my true love gave to me\n" +
                    "Two turtle doves and a partridge in a pear tree" );
            return;
        
        case 3:
            System.out.println("On the third day of Christmas my true love gave to me\n" +
                    "Three French hens, two turtle doves and a partridge in a pear tree");
            return;
            
        case 4:
            System.out.println("On the fourth day of Christmas my true love gave to me\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            return;
                
        case 5:
            System.out.println("On the fifth day of Christmas my true love gave to me\n" +
                    "Five gold rings, four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            return;
            
        case 6:
            System.out.print("On the sixth day of Christmas my true love gave to me\n" +
                    "Six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            return;
            
        case 7:
            System.out.println("On the seventh day of Christmas my true love gave to me\n" +
                    "Seven swans a swimming, six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            return;
            
        case 8:
            System.out.println("On the eighth day of Christmas my true love gave to me\n" +
                    "Eight maids a milking, seven swans a swimming\n" +
                    "Six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            return;
            
        case 9:
            System.out.println("On the ninth day of Christmas\n" +
                    "Nine ladies dancing, eight maids a milking\n" +
                    "Seven swans a swimming, six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            return;
            
        case 10:
            System.out.println("On the tenth day of Christmas my true love gave to me\n" +
                    "Ten lords a leaping, nine ladies dancing, eight maids a milking\n" +
                    "Seven swans a swimming, six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            return;
            
        case 11:
            System.out.println("On the eleventh day of Christmas my true love gave to me\n" +
                    "Eleven pipers piping, ten lords a leaping\n" +
                    "Nine ladies dancing, eight maids a milking\n" +
                    "Seven swans a swimming, six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            return;
            
        case 12:
            System.out.println("On the twelfth day of Christmas my true love gave to me\n" +
                    "Twelve drummers drumming, eleven pipers piping\n" +
                    "Ten lords a leaping, nine ladies dancing, eight maids a milking\n" +
                    "Seven swans a swimming, six geese a laying, five gold rings\n" +
                    "Four calling birds, three French hens\n" +
                    "Two turtle doves and a partridge in a pear tree");
            return;
       }   
    }
}