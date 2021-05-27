package day17_ternary_nested_conditions;

public class pass {
    public static void main(String[] args) {
        char grade = 'A';
        boolean pass = grade =='A' || grade =='B';
        boolean pass2 = grade =='C' || grade =='D';

        if (pass || pass2) {
            System.out.println("You pass");
        } else {
            System.out.println("fail");
        }
    }
}
