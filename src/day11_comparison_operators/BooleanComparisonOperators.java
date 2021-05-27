package day11_comparison_operators;

public class BooleanComparisonOperators {

    public static void main(String[] args) {

        System.out.println( 10 == 10);  // true
        System.out.println( "10 == 10");  // 10 == 10
        System.out.println(1000 > 100); // true 1000 is greather then 100
        System.out.println(985.44 < 98547.8); // true
        System.out.println(10 <= 11); // true 10 less then 11
        System.out.println(5 >= 3); //
        System.out.println(-100 != 44); // true - 100 because is NOT EQUAL 44


        int a = 100;
        int b = 200;
        System.out.println(a == b); // false
        System.out.println(a > b); //
        System.out.println(a >= b); // true
        System.out.println(a <= b); // true
        System.out.println(a != b); // true


        boolean result;
        result = 5 == 5;
        System.out.println("result =" + result); // result = true

        result = 33 > 44;
        System.out.println("result = " + result);// result = false

        result = 88 < 99;
        System.out.println("result = t or f =" + result);


        result = 10>= 10;
        System.out.println("result = " + result);

        result = 123 <= 124;
        System.out.println("result = 123 <= 124 = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle"); // true
        System.out.println(city == "Baku"); // false
        System.out.println(city != "Fairfax");

        String name = "Nadir";
        boolean checkName = name =="Nadir";
        System.out.println("checkName = " + checkName);
        








    }
}
