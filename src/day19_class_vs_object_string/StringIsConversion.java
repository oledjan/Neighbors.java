package day19_class_vs_object_string;

public class StringIsConversion {
    public static void main(String[] args) {

        String word = "CyberTek";
        String sentence = "JAVA is FUN, OLEG YOU need to improve your knowledge";
        System.out.println(word.toLowerCase()); // this command convert word to lowercase
        System.out.println(word.toUpperCase()); // this command convert word to UPPERCASE
        System.out.println("JAVA".toLowerCase()); // print in LOWERcase java
        System.out.println(sentence.toLowerCase());



        word.toLowerCase();
        System.out.println(word);

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase" + wordInLcase);


        // change word to all lowercase letter
        word = word.toLowerCase();
        System.out.println("word = " + word);

        // other example
        String company = "Amazon Web Services";
        System.out.println(company.toUpperCase()); // result is: AMAZON WEB SERVISES
        System.out.println("company is uppercase: " + company.toUpperCase()); // result: company is uppercase: AMAZON WEB SERVICES
        System.out.println("java".toUpperCase()); // result: JAVA


        // change company "Amazon" to "Amazon" preAssigned
        System.out.println("company = " + company); // result: company = Amazon Web Services
        company = company.toUpperCase();
        System.out.println("company = " + company); // result: company = AMAZON WEB SERVICES






    }
}
