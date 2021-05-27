package day14_multi_branch_if_statements;

public class LogicalANDoperator {
    public static void main(String[] args) {
        System.out.println(true && true); // true
        System.out.println(true && false); // false


        System.out.println(10> 5 && 1 == 1); // true. true + true = true
        System.out.println(8 >7 && 3 >= 10); // false
        System.out.println(3 < 2 && 5< 3); // false

        int apples = 10, oranges = 5;
        boolean check = apples > 5 && oranges > 3;
        System.out.println("Chwck = " + check);
        if (apples > 6 && oranges > 2) {
            System.out.println("I have eniught apples and oranges");
        } else {
            System.out.println("I need to go Walmart to buy some fruits");
        }

    }
}
