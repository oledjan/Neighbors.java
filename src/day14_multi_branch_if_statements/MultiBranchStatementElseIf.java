package day14_multi_branch_if_statements;
/*
add new class MultiBranchIfStatement
add main method

day -> 1
if day -> 1 : Monday
if day -> 2 : Tuesday
if day -> 3 : Wednesday
 */

public class MultiBranchStatementElseIf {
    public static void main(String[] args) {
        int day = 3;
        if (day == 1) {
            System.out.println("Monday");
        } else {
            System.out.println("Not Monday");
        }
        if (day == 2) {
            System.out.println("Tuesday");
        }
        if (day == 3) {
            System.out.println("Wednesday");
        }
        System.out.println(" ==================== Multi Branch IF statement ===================");


        day = 20;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("Java day");
        }

        System.out.println("Everyday code java");
    }
}
