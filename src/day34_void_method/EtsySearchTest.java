package day34_void_method;
// open browser
// navigateToEtsyUrl
// searchForWoodenSpoon
// verifyResultsAreDisplayed
public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("----- Starting EATSY Search Smoke Test ----");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("----- EATSY Search Smoke Test completed - PASS-----" );
    }
    public static void openBrowser() {
        System.out.println("1. Launching Chrome browser");
    }
    public static void navigateToEtsyUrl() {
        System.out.println("2. Navigation to https://www.etsy.com/");
    }
    public static void searchForWoodenSpoon() {
        System.out.println("3. Pass: Verify Etsy home page is displayed");
        System.out.println("3.a. Type wooden spoon in search field and click search");
    }
    public static void verifyResultsAreDisplayed() {
        System.out.println("4. Pass: Search results are successfully displayed https://www.etsy.com/search?q=wooden%20spoon");
    }

}
