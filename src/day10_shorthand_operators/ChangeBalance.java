package day10_shorthand_operators;

import javax.lang.model.SourceVersion;

public class ChangeBalance {

    public static void main (String[] args) {

        double balance = 1200.44;
        System.out.println ("balance = " + balance);
        double baklava = 22.50;
        System.out.println ("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("balance = " + balance);

        double kunefe = 44.45;
        System.out.println("kunefe = " + kunefe);
        balance = balance - kunefe;
        System.out.println("balance after kunefe = " + balance);

        // second kunefe is 50% off. lets buy it
         kunefe = kunefe / 2;
        System.out.println("kunefe = " + kunefe);
         // buy it and decrease balance with kunefe price

        balance = balance - kunefe;
        System.out.println ("balance after second kunefe =" + balance);


        double plov = 7.99;
        System.out.println ("plov = " + plov + "$");
        balance = balance - plov;
        System.out.println ("balance after plov = " + balance);

        double iceTea = 3;
        System.out.println ("iceTea = " + iceTea);
        balance = balance - iceTea * 4;
        System.out.println ("balance after 4 iced teas = " + balance);

        // return baklava
        System.out.println("returning baklava  = " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava = " + balance);


    }
}
