package day26_for_loop;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 2;

        if (num < 1 || num > 10) {
            System.out.println("ERROR: invalid input");
            return; // exit main method/ stop the program
        }
        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " x " + i + " = " + (num * i));
        }
        // ABOVE is same BUT too much TYPING CODE not proffesional
       // System.out.println(num + " x " + 1 +" = "+ (num*1));
        // System.out.println(num + " x " + 2 +" = "+ (num*2));
        // System.out.println(num + " x " + 3 +" = "+ (num*3));
        // System.out.println(num + " x " + 4 +" = "+ (num*4));
        // System.out.println(num + " x " + 5 +" = "+ (num*5));
        // System.out.println(num + " x " + 6 +" = "+ (num*6));
        // System.out.println(num + " x " + 7 +" = "+ (num*7));
        // System.out.println(num + " x " + 8 +" = "+ (num*8));
        // System.out.println(num + " x " + 9 +" = "+ (num*9));
    }
}
