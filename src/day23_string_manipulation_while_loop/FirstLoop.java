package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {

        int i = 5;
        while (i<=5) { // if we are changing to WHILE this LOOP. ALWAYS running program
            System.out.println("Java is fun"); // result is 5
            i++;
        }

        int apples = 0;
        while (apples <= 3) { // if is TRUE always is RUNNING
            System.out.println("apples -> " + apples);
            apples++; // 1,2,3, 4 and going to print number 4 last print statement

        }
        System.out.println("apples = " + apples); // apples = 4
    }
}
