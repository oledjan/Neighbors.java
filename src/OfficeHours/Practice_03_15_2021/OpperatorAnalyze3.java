package OfficeHours.Practice_03_15_2021;

public class OpperatorAnalyze3 {
    public static void main(String[] args) {

        int a = 10;
        int b = a - 5 * 2 + a / 2;

        // how is looks like 10 - 5 * 2 + 10 / 2;
         //                  10 - 10  + 10 / 2
        //                   10 - 10 + 5
        //          result is 5
        System.out.println("a: " +a);
        System.out.println("b: " + b);
    }
}
