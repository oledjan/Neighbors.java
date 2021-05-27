package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {

        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word = "+ words[0]);
        System.out.println("2st word = "+ words[1]);
        System.out.println("3st word = "+ words[2]);
        // System.out.println("4st word = "+ words[3]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3


        for (String w : words) {
            System.out.println(w);
        }


        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String [] results = googleResult.split(" ");
        System.out.println("Count = " + results[1]);
        System.out.println("Seconds = "+ results[3].replace("(","")); // same idea Seconds = 0.68
        System.out.println("Seconds = "+ results[3].substring(1)); // same idea Seconds = 0.68


    }
}
