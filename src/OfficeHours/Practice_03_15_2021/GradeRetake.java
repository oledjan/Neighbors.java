package OfficeHours.Practice_03_15_2021;

public class GradeRetake {
    /*
    Write a program that will give the grade after the retake. The program should read a score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
     */
    public static void main(String[] args) {

        int baseGrade = 90;
        int numberOfAttempts = 1;
        int retakePenalty = 0;

        if (numberOfAttempts == 1) {
            retakePenalty = (int)(baseGrade * .10);
        }
        if (numberOfAttempts == 2) {
            retakePenalty = (int) (baseGrade * .20);
        }
        if (numberOfAttempts == 3) {
            retakePenalty = (int) (baseGrade * .35);
        }
        System.out.println("Grade after retake attempt " + numberOfAttempts + " was: " + (baseGrade - retakePenalty));
    }
}
