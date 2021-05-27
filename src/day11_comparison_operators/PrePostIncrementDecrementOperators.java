package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {

    public static void main (String [] args) {

        // PRE - INCREMENT ++ (increase by 1)
        int num1 = 10;
        int num2 = ++num1;
        System.out.println ("num1 = "+ num1); // num1 = 11;
        System.out.println("num2 = " + num2); // num1 = 11;

        // POST - ICREMENT -> add 1 afterwords

        int num3 = 8;
      //   int num4 = num3;
       //  num3++; // add 1
       // int num3 = num4++;
        System.out.println("num3 = " + num3);


        int apples = 5;
        int basket = ++apples;

        System.out.println("basket = " + basket);
        System.out.println("apples = " + apples);

        int cars = 5;
        System.out.println(++cars); // result is printed 6

        int sedans = 10;
        System.out.println(sedans++); // result is printed 10

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        // adds 1 to a HERE, at this step
        System.out.println ("a = " + a); // a = 51
        System.out.println ("b = " + b); // b = 23
        System.out.println ("c = " + c); // c = 73


    }

}
