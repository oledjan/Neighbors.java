package day19_class_vs_object_string;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i")); // true
        System.out.println(word.startsWith("in")); // true
        System.out.println(word.startsWith("intellij idea"));// true

        System.out.println(word.startsWith("Int")); // false
        System.out.println(word.endsWith("idea"));


        // other
       /*
       string url =
        */
        String url = "https://www.stackoverflow.com";
        if (url.endsWith(".com")) {
            System.out.println("Comercial website");
   //     } else if (url)

    }
    }
}