package day24_loops;

import java.sql.SQLOutput;

public class WhileLoopApples {
    public static void main(String[] args) {
        int apples = 1;

        while (apples <= 10) {
            System.out.println("eating an apple - " + apples);
            apples++;

        }
        System.out.println("No more apples :( ");
    }
}
