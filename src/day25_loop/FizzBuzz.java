package day25_loop;

public class FizzBuzz {
    public static void main(String[] args) {
        // loop from 1 to 100
        // when is num divisible by 3 and 5 --> "FizzBuzz"
        // when is num divisible by 3 --> "Fizz"
        // when is num divisible by 5 --> "Buzz"

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz: ");
            } else if (i % 3 == 0) {
                System.out.println("Fizz: ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ: ");
            } else {
                System.out.println(i);
            }

        }
    }
}
