package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "Venti";
        double price = 0.0;
        int calories = 0;


        switch (size) {
            case "Tall":
                System.out.println("Tall cappuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "Grande":
                System.out.println("Grande cappuccino please");
                price = 3.99;
                calories = 120;
                break;
            case "Venti":
                System.out.println("Venti cappuccino please ");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("We don't serve that " +size+" Cappuccino");
                break; // optional if default is at the end


        }
        System.out.println("Total price: $" + price);
        System.out.println("You will consume: " + calories + " cals of energy");

    }
}
