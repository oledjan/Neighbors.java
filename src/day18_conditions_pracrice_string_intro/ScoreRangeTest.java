package day18_conditions_pracrice_string_intro;

public class ScoreRangeTest {
    public static void main(String [] args) {
        int score = 98;

        if (score >= 1 && score <= 40) {
            System.out.println("You get D:  " + score);
        } else if (score >=41 && score <= 60) {
            System.out.println("You get C: " + score);
        } else if (score >= 61 && score <= 90) {
            System.out.println("You get B: " + score);
        } else if (score >= 91 && score <= 100) {
            System.out.println("You get A, good job! : " + score);
        } else {
            System.out.println("YInvalid score = " + score);
        }
    }
}
