package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String [] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);

        word = word.replace("hub","lab"); // result word = github
        System.out.println("word = " + word); // result word = gitlab

        // gitlab
        // i>0 a-i --> gotlib
       // word.replace('i','o');
        System.out.println(word.replace('i','o'));

        // other example
        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ","");
        System.out.println("withNoSpaces = " + withNoSpaces); // result withNoSpaces = javaisfun


        // "java" replace to "selenium" -> " a lot fun" -.,
        sentence = sentence.replace("java","selenium").replace("fun","a lot fun");
        System.out.println("sentence = " + sentence);

// example from amazon search line
        String result = "1-48 of over 4,000 results for Java book";
        result = result.replace ("1-48 of over","")
                       .replace(",","")
                        .replace(" results for java book","");
        System.out.println("result = " + result);





    }
}
