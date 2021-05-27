package day08_casting_scanner;

public class ShoppingBalanceCalculator {

    public static void main (String [] args) {

       double balance = 345.55;
       double price1 = 20.88;
       double price2 = 89.99;
       double price3 = 15.00;


       double remainingBalance = balance - (price1 + price2 + price3); // 219.68
        //double remainingBalance = balance - price1 - price2 - price3;// 219.68



       System.out.println ("Your initial balance: $" + balance); // Your initial balance: $345.55
       System.out.println ("Your remaining balance: $" + remainingBalance); // Your remaining balance: $219.68


       // How to do without cents????????
        int balanceWithNoCents = (int) remainingBalance; // 219.68 converting (RESULT 219 without cents)
        System.out.println ("Your remaining balance without cents: $" + balanceWithNoCents); // Your remaining balance without cents: $219




    }


    }

