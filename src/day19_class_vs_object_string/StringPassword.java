package day19_class_vs_object_string;

public class StringPassword {
    public static void main(String[] args) {
        String password = "hello121222";

        if (password.length() >=6) {
            System.out.println("Valid amazon password");
        } else {
            System.out.println("Password too short");
        }
    }
}
