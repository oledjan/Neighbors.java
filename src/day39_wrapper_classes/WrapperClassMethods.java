package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(5, 2));
        System.out.println("Min integer: "+ Integer.MIN_VALUE);
        System.out.println("Max integer: "+ Integer.MAX_VALUE);


        System.out.println(Double.max(234.4, 23.9));
        System.out.println("Min DOUBLE: " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);


        System.out.println(Double.compare(5,1)); // 1  first is largest
        System.out.println(Double.compare(5,5)); // 0 both is equal
        System.out.println(Double.compare(5,62)); // -1 first is smaller than second

        System.out.println(Character.isDigit('8')); // true
        System.out.println(Character.isDigit('v')); // false
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('r')); // true

        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("It is uppercase");
        }
        String word = "Java is FUN";

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.print(word.charAt(i));
            }


        }




    }
}
