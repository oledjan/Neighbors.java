package day25_loop;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        // print all even numbers beetween 1 - 100
        // print all odd numbers beetween 1 - 100
        System.out.println("Even numbers: ");

        for (int n = 0; n <= 100; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");

            }
        }
        System.out.println("\nODD NUMBERS 0 - 100: ");
        for (int k = 0; k <= 100; k++) {
            if (k % 2 != 0) {
                System.out.print(k + " ");
            }
        }
    }
}
