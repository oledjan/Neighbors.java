package day08_casting_scanner;

import java.util.Arrays;

public class CastingExamples {


    public static void main(String[] args) {

        // byte - short - int - long
        //IMPLICIT - convert/IMPLICIT small data yto larger AUTOMATICALLY

        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = num3;
        long num5 = num4;


        // float - double
        float num6 = 124.6F;
        double num7 =num6;

        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8); // 3456
        System.out.println ("num9 + " + num9); // num9 + 3456.0

        // long - int - short - byte
        //EXPLICIT
        int num10 = 22;
        byte num11 =  (byte) num10; // byte num11 = num10; need to resized like byte num11 =  (byte) num10;
        short num12 = (short)num10; // cast/convert to smaller short
        System.out.println ("num10 = " +num10);
        System.out.println ("num11 = " +num11);
        System.out.println ("num12 = " +num12);

        double num13 = 55.3;
        float num14 = (float) num13; // why is not working cause need to CASTED TO larger type float
        System.out.println ("num13 =" + num13);
        System.out.println ("num14 =" + num14);


        double num15 = 1234.5;
        int num16 = (int) num15; // will be whole number 1234
        System.out.println("num15 = " + num15);
        System.out.println ("num16 = " + num16);


        int num17 = 300;
        byte num18 = (byte) num17;

        //Casting CHAR to INT
        char letter = 'O'; // 79 from acii table
        int numLetter = letter;
        System.out.println ("numLetter = " + numLetter); // numLetter = 79













    }
}
