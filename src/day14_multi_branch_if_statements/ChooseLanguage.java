package day14_multi_branch_if_statements;
/*
add a new class ChooseLanguage
add main method

selection -> 1 : "hello, thank for your call"
          -> 2 : "hola, gracias para llamar"
          -> 3 : "merhaba, aradiginiz icin tesekkurler"
          -> 4 : "privet, spasibo za vash zvonok"
          -> 5 : "Merci ,pour votre appel"
          -----> "lets talk java and english, hello"
 */
public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language");
        int language = 8;
        if (language == 1) {
            System.out.println("hello, thanks for your call");
        } else if (language == 2) {
            System.out.println("hola, gracias para llamar");
        } else if (language == 3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (language == 4) {
            System.out.println("privet, spasibo za vash zvonok");
        } else if (language == 5) {
            System.out.println("Merci ,pour votre appel");
        } else {
            System.out.println("lets talk java and english, hello");
    }
        System.out.println ("Learning other languages always good for your mind and memory");
    }
}

