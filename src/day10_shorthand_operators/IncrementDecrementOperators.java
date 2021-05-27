package day10_shorthand_operators;

/*
int num =10;
num = num + 1;
num += 1;
num++;
++num;    all this is adding +1
 */
public class IncrementDecrementOperators {
    public static void main (String [] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++; // add 1
        i++;// add 1
        ++i;// add 1
        ++i; // add 1
        System.out.println("i = " + i);

        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        // increase linesOfCode by 1, 4 different ways that we learn today
        
        linesOfCode = linesOfCode + 1;
        linesOfCode+=1;
        linesOfCode++;
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        
        
        // type 4 different ways decriasing by 1
        
        linesOfCode = linesOfCode - 1;
        linesOfCode -= 1;
        linesOfCode --;
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        char letter ='a';
        System.out.println("letter = " + letter);
        letter++; // charge to next character
        ++letter;
        System.out.println("letter = " + letter);
        letter --;
        System.out.println("letter = " + letter);
        

    }
}
