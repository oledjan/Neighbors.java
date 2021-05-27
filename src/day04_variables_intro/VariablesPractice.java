package day04_variables_intro;

public class VariablesPractice {
    public static void main (String [] args) {
        // declare variable students that stores number
        int students; //declare ONCE
        students = 50; // assign
        System.out.println (students); // printing just 50 from top to buttom
        System.out.println (students);
        students = 70;
        System.out.println (students);

        students = 111;
        students = 125; //last value
        System.out.println (students);

        int teachers;
        teachers = 2;
        int mentors; // at this point we have 3 assignments (students, teachers, mentors)
        mentors = 25;
        System.out.print ("Number of theachers:  ");
        System.out.println (teachers); // 2

        //Print numbers of mentors
        System.out.print ("Numbers of mentors:  ");
        System.out.println (mentors);
        System.out.println (mentors);




    }
}
