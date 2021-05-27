package OfficeHours.Practice_04_13_2021;

public class buildEmail {
    public static void main(String[] args) {
        Email("Nadir", "FannieMae");
        Email("John Ward III", "Verizon");

    }
    public static void Email (String name, String domain) {
        name = name.replace(" ","_").toLowerCase();
        domain = domain.toLowerCase();
        String email = "name" + "@" + domain+ ".com";
        System.out.println(email);
    }
}
