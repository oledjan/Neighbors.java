package day37_methods_overloading;

public class WarmupMethod {
    public static void main(String[] args) {
        loginVoid("Cebertekstudent", "abc123"); // positive TEST / SUNNY DAY
        loginVoid ("cybertek", "answer"); // negative TEST / RAINY day
        loginVoid("", "");
        System.out.println(login("Cebertekstudent", "abc123"));

        if(login("Cebertekstudent", "abc123")) {
            System.out.println("Login succesfull, welcome to Canvas");
            System.out.println("Select the course to continue");
        }else{
            System.out.println("Login FAILED");
        }
        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if (login("nadir", "mountain")) {
            System.out.println("Welcome to Canvas");
        } else{
            System.out.println("Something is wrong with your credential");
        }

    }
    public static void loginVoid(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUserName)&& password.equals(secretPassword)) {
            System.out.println("Login successful, welcome to CybertekAtudent!");
        } else{
            System.out.println("Incorrect username or password");
        }
    }
    public static boolean login (String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
// return userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword); LIKE this SAME is short way
        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            return true; // return TRUE, and exit METHOD HERE, return false will not run
        }
        return false;  // like that you can do without ELSE
    }
}
