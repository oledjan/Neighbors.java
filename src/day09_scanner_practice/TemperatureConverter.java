package day09_scanner_practice;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("############# F to C CONVERTER PROGRAM ##############");
        System.out.println ("Enter Fahrenheit: ");
        double tempF = scan.nextDouble();
        double tempC = (tempF-32)*5/9;


        System.out.println(tempF +"  F in C: " + tempC);
    }
}
