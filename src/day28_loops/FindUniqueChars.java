package day28_loops;

/**
 * Given string retrive and print only unique character
 */
public class FindUniqueChars {
    public static void main(String[] args) {
        String word = "jjjavvai";
        String unique = "";


        for (int n = 0; n < word.length(); n++) {
           if (!unique.contains(word.charAt(n)+"")) {
               unique += word.charAt(n);
           }
        }
        System.out.println(unique);
    }
}
