package day09_scanner_practice;
import java.util.Scanner;
// COINS MACHINE
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter cents: ");

        //int cents = 255; hard coding you CAN NOT to change outside
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println ("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);
        // in 123 cents: 1 dollars 23 cents
        System.out.println ("In " + cents + " cents: " + dollars + " dollars " + remainingCents + " cents");


    }
}
