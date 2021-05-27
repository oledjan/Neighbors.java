package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber (431111111155555L);
        acc.setBalance(520.50);
        acc.setAccountHolder("Mike Josho");
        acc.setType("360 Checking");


        System.out.println("acc = " + acc);;
    }
}
