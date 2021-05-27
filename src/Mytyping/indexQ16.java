package Mytyping;

public class indexQ16 {
    public static void main(String[] args) {
        String s = "I will find the lost book";
        String word = "";
        for (int index = s.length()-1; index <=0;index--) {
            word +=s.charAt(index);
        }
        System.out.println(word);

        String str = "cybertek";
        for (int i =0; i <=str.length(); i+=2) {
            System.out.println(str.charAt(i));
        }

        int count = 0;
        for (int a = 0; a<4;a++){
            if (a==3) continue;
            for (int b = a+1; b<5; b++) {
                count++;
                if (b==3)break;
            }
        }
        System.out.println(count);
    }
}
