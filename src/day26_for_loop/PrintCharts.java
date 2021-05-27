package day26_for_loop;

public class PrintCharts {
    public static void main(String[] args) {
        String word = "I will become SDET";
       // System.out.println(word.length());

        for (int i =word.length()-1; i >= 0 ; i--) { // reverse with --- minus
            System.out.print(i + " - " + word.charAt(i));
        }
/**
 * long way, without loop.
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
 */

    }
}
