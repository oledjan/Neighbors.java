package day13_conditional__statements;
/*
temp -> 71
tempetature = 70 or more is nice day
    if true:
       "It is a beautiful day!"
       "Lets code java"
    else
   It is kind of cold today
   Stay home and code java"
 */
public class NiceDayOrNot {
    public static void main(String[] args) {
        System.out.println("Nice day today or no?");

        int temp = 72;

        if (temp >= 70) {
            System.out.println("It is a beautiful day!");
            System.out.println("Lets code java");
        } else {
            System.out.println("It is kind of cold today");
            System.out.println("Stay home and code java");
        }


    }

}
