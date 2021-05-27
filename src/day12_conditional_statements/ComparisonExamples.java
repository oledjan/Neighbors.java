package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 4_5;//45
        int speedLimit = 5_5; // 55

        System.out.println(currentSpeed > speedLimit); // false 45 not more 55
        System.out.println(speedLimit < currentSpeed);// false 55 not less 45
        System.out.println(speedLimit == currentSpeed); // false 55 not equal to 45

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + "mph");
        // 45+20 -> 65
        currentSpeed += 20; // 65

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding now? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + "mph");

        // new axample
        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice)); // true

        boolean canAfford = (accountBalance >= itemPrice);
        System.out.println("can afford = " + canAfford); // can afford = true

        // decrease by item price
        accountBalance -= itemPrice; // same longer way =accountBalance - itemPrice

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am i broke? - " +isBroke); // Am i broke? - false





    }
}
