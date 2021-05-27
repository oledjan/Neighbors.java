package day19_class_vs_object_string;

public class StringLength {
    public static void main(String[] args) {

        // this used when you type your password they said At least 6 characters Amazon login
        String word = "java";
        System.out.println("Check how many characters");
        System.out.println("count: " + word);
        System.out.println(word.length());
        System.out.println("wooden spoon".length()); // result 12


        // other
        String firstName = "Nadir";
        System.out.println(firstName + "-" + firstName.length()); // Nadir-5

        // other
        int count = firstName.length();
        System.out.println("count = " + count); // result count = 5
    }
}
