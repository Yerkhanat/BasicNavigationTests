package tests;


import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.BrowserUtils;
import utilities.StringUtility;

public class BasicNavigationTests1 {
    public static void main(String[] args) {
       WebDriver driver = BrowserFactory.CreateDriver("safari");
       //WebDriver driver =DriverFactory.CreateDriver("chrome");

        driver.get("http://www.google.com");
        String titleGoogle = driver.getTitle();
        driver.get("http://www.etsy.com");
        String titleEtsy = driver.getTitle();
        BrowserUtils.wait(2);
        driver.navigate().back();
       StringUtility.verifyEquals(titleGoogle,titleEtsy);
       driver.navigate().forward();
       StringUtility.verifyEquals(titleEtsy,driver.getTitle());
       driver.quit();



    }
}
