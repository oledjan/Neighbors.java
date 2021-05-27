public class Authentication {
    public static void main(String[] args) {
        int expLast4SSN =1234;
        int expPinCode = 4321;

        int last4SSN = 4444;
        int pinCode = 4321;

        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentification successful");
        } else {
            System.out.println("Authentication unsuccessful");
            if (last4SSN != expLast4SSN) {
                System.out.println("Last 4 SSN number is INCORRECT");
            }

        }
    }
}
