package day13_conditional__statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmount = 2500;

        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualify for bonus!");
            bonus = 50.0; // conditional value assignment
        } else {
            System.out.println("Great job, you are qualifid for full bonus");
            bonus = 100;
        }

        System.out.println("Your total bonus: $" + bonus);
    }
}
