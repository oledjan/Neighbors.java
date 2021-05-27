package day12_conditional_statements;

/*
add new class CompareChars
add main method

letter1, letter2 assign char values.
print and check if they are equal
print and check if letter1 is larger than letter2
print and check if letter2 is larger than letter1
 */
public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A'; // char we are using ACII table with numbers and letters
        char letter2 = 'J';
        System.out.println(letter1 == letter2); // 65 ==74 FALSE
        System.out.println(letter1 > letter2); // 65 > 74False
        System.out.println(letter2 >letter1);//74 > 65 True


        // grade in a school pass or false class
        char grade = 'A'; // if you will type here E then will FAlse
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? - " + pass); // Did you pass the exam? - true




    }
}
