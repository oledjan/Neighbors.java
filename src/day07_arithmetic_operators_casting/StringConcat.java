package day07_arithmetic_operators_casting;

public class StringConcat {
    /*
    system.out.println ("java" + 5 + 3);
    output:
             java8
             java53
             ERROR
     */
    public static void main (String [] args) {
        System.out.println ("java" + 5 + 3); //  OUTPUT: java53
        System.out.println ("java" + (5 + 3));  // java8 (cause parenthesis inside counting FIRST
        System.out.println (5 + 3 + "java"); // 8 java
        System.out.println (5 + (3 + "java")); // evaluate 53java
        System.out.println("hello" + 1 + 2 + 3); // hello123
        System.out.println("hello" + (1 + 2 + 3)); // hello6

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1+str2); // hellofriends

        // printout with SPACE hello friends
        System.out.println (str1 + " "+str2);

        int num1 = 7;
        int num2 = 8;
        System.out.println (num1 + num2); //15
        System.out.println (num1 + " " + num2); // 7 space 8

        // 78
        System.out.println (num1+""+num2); // 78

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 + char2); // 195  , + beetween CHARs it will add number from ACII table
        System.out.println (char1+""+char2); // will be ab result











    }
}
