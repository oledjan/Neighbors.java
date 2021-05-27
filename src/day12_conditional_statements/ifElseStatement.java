package day12_conditional_statements;

public class ifElseStatement {
    public static void main (String[] args) {
        if(10 > 5) {
            System.out.println("Condition is TRUE");
        } else {
            System.out.println ("Condition is False");
        }

        int count = 25;
        // check if count is more than 30. If yes, print "countis more than 30'
        // otherwise print "count is less than 30"
        if (count > 30) {
            System.out.println("count is more than 30");
        }else {
            System.out.println("count is less than 30");
        }


        byte age = 25;
        if(age >= 18) { // greater or equal mean in this case it is TRUE

            System.out.println ("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else {
            System.out.println("NOT eligible to vote");
            System.out.println ("Age is less than 18");
        }
    }
}
