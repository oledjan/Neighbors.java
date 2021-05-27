package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {

        String technologies = "java, html, css, selenium, testng, maven, cucumber";
       // first comma
        System.out.println(technologies.indexOf(",")); // 4 index of java, coma is 4
        // last comma
        System.out.println(technologies.lastIndexOf(",")); // 40
        // for loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index = " + indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index" +idxOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql"); // not present -1
        System.out.println("sql is at index " + indexOfSql);

        // contain maven?
        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else{
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven") > -1) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }


    }
}
