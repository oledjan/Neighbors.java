package day24_loops;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random  randomNum = new Random();
        //System.out.println(randomNum.nextInt(101)); // random number until 101
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber = 0;
        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if (guessingNumber > secretNumber) {
                System.out.println("Wrong, your number too large");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Wrong, your number is too small");
            }
        }while (secretNumber != guessingNumber);
        System.out.println(" Number is correct. You win, your number is: " + secretNumber);




    }
}
