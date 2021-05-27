package day10_shorthand_operators;

import java.sql.SQLOutput;

public class ChageVariableValue {
    public static void main (String [] args) {
        int count = 3;
        System.out.println("count = " + count);
        // add/increase count by 2
        count = count + 2;
        System.out.println("count = " + count);

        int apples = 2;
        System.out.println ("apple =" + apples); // 2
        apples = apples + 10; // increasing by 10apples
        System.out.println("apples = " + apples);//increasing by 10 = 12 total apples
         apples = apples - 3; // applse dicrease 3 that means -3
        System.out.println("apples = " + apples);// 9


        int pizzaSlices = 8;
        System.out.println ("pizzaSlices =" + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        //get another whole small pizza just for you - 6 slices
        pizzaSlices = pizzaSlices + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);

        // axample
        int players = 10;
        System.out.println ("players =" + players);
        // double the players to start the match
        players = players * 2;


        // axample
        int cents = 568;
        System.out.println("cents = " + cents);
        // keep whole dollars portion and just remaining cents
        cents = cents % 100; // cents =568
        System.out.println("remaining cents = " + cents); // remaining cents = 68


    }

}
