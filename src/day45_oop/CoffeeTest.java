package day45_oop;

import java.util.List;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();
        System.out.println("Coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("Amount after refill + "+ myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("Amount after drink 10 =" +myCoffee.getAmount());
        // NOT : instead of
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = "+ myCoffee.getType());
        // describe myCoffee - show all variable values
        System.out.println(myCoffee.toString());

        //Add another coffee object, set values, call methods

        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type =" + coffee1.getType());
        // assign coffee1 object to coffee2
        // hey java, point coffee2 to same object as coffee1
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = "+ coffee2.getType());
        coffee2.setType("Espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappuccino");
        // point to same object
        coffee3 = coffee2;
        System.out.println("coffee3 type = "+ coffee3.getType());

        Coffee coffee4 = null;// reference pvariable does not refer/point to any object in HEAP
        coffee4.setType("turkish");//NullPointerException



    }
}
