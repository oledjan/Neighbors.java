package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " +(!false));

        int age = 8;
        // check if age IS NOT more than 7. print "Need to sit in child car seat."

        if (!(age>7)) {
            System.out.println("Need to sit in child car seat. Age = " + age);
        } else {
            System.out.println("Can sit normal seat.Age = " + age);
        }

// OTHER example
        boolean isSmokingAllowed = false; //

        // if smoking is not allowed : print "Smoking is NOT allowed here. Exit."
        if (!isSmokingAllowed) {
            System.out.println("Smoking is NOT allowed here. Exit. ");
        } else {
            System.out.println("This area is for smoking");
        }


// OTHER EXAMPLE
        boolean isAffordable = true;

        // if its NOT affordable then print "Item Not affordable".

// other
        String carModel = "Tesla";
        // if its not Tesla, print NOT interested
        if (!carModel.equals("Honda")) {
            System.out.println("Not interested, thank you");
        }
// OTHER example
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        // if inputPassword IS NOT equals inputPassword: print "Incorrect Password"

        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect Password");
        }

        if (!inputPassword.equals("abc123")) {
            System.out.println("Correct password");
        } else {
            System.out.println("Incorrect password");
        }
    }
}
