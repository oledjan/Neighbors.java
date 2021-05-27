package day13_conditional__statements;

public class IfWithBooleanVariables {
    public static void main (String[] srgs) {

        boolean isHungry = true;

        if (isHungry == true) {

        }
        if (isHungry) {
            System.out.println("I am hungry, i will go get something to eat");
            System.out.println("Then code java");
        } else {
            System.out.println("I am not hungry, i will keep coding java!");
        }


        double price = 230.44;
        boolean isAffordable = price <= 200.0; // 200 is budget

        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
        } else {
            System.out.println("Too expensive, lets keep coding java");
        }


        // other example
        boolean isRemoteJob = true;
        // if it NOT remoteJob print "Sorry i am not interested"
        //otherwise, print "Sure i am interested
        //if (is remote job == false
        if (isRemoteJob != true) {
            System.out.println("Sorry, I am not interested");
        } else {
            System.out.println("Sure, I am interested, what is interview process? ");
        }
    }
}
