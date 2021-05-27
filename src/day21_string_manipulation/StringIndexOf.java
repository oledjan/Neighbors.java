package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        //**    */
        String word = "github";
        System.out.println(word.indexOf("t"));
        System.out.println(word.indexOf("u"));
        System.out.println(word.indexOf("hub")); // 3 because Hub is H 3rd
    }
}
