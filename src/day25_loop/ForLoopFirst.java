package day25_loop;

public class ForLoopFirst {
    public static void main(String[] args) {
       /**
        * below is infinite loop with for loop like: while (true) { }
        * for(;;) {
            System.out.println("Java is fun!");
        }
*/
       // for loop: 1 - 10, print the number
        //  step 1)       2)    step 4)
       for (int i = 0; i <= 5; i++) {
           System.out.println("hello world"); // step 3
       }

       for (int i = 2; i <= 10; i++) {
               System.out.println(i);
           }
       }
    }
