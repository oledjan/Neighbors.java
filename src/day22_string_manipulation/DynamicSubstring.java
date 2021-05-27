package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13)); // start of

        // find the index of :
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));

        // now combine into 1 statement
        System.out.println(result.substring(result.indexOf(":") +1 ));


        /** find indexOf [
         * find index ]
         * provide them as start, end index for substring
         * to print java
         *
         */
        String today = "i learned [Oleg] today";
        int start = today.indexOf("[");
        int end = today.indexOf("]");


        System.out.println(today.substring(start+1, end));


    }
}
