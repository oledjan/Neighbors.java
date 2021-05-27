package day25_loop;

public class SumOfNumbers {
    public static void main(String [] args) {
        int sum = 0;
        for (int count = 1; count <= 20; count++) {
            System.out.println(count);
            sum += count;

        }
        System.out.println("Count = " + sum);

// if we are not using LOOP we need to print a lot of LINES, LOP is easiest way
        int sum2 = 0;
        sum2 += 1;
        sum2 += 2;
        sum2 += 3;
        sum2 += 4;
        sum2 += 5;
        sum2 += 6;
        sum2 += 7;
        sum2 += 8;
        sum2 += 9;
        sum2 += 10;
        System.out.println("sum2 = " + sum2);
    }
}
