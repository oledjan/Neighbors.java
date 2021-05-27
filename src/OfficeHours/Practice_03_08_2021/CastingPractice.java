package OfficeHours.Practice_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {

        // casting byte -> int -> long -> float -> double
        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (short)d;
        int i2 = (int)d;
        System.out.println(i); // 5
        System.out.println((double)i); // 5.0


        float f = 3.54f;
        float f2 = 3.54f; // float = compiler thinking this is double need like this (float)3.54

        float f3 = 5; // float = int -> 5.0
        float f4 = 5.5F; // float = double

        long l = 22131; // long = int
        long l2 = 3122112222222L;
        System.out.println(l);
        System.out.println((double)l);
        System.out.println((float)l);

        double million = 1_000_000; // in accounting million for ex 10000000 not readible then using under score _
        System.out.println();

    }
}
