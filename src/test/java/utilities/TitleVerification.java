package utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList(
                "http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver = BrowserFactory.CreateDriver("chrome");
        for (int i = 0; i <urls.size() ; i++) {

            driver.get(urls.get(i));
            StringUtility.verifyEquals(driver.getTitle(),"Practice");
            System.out.println(" all pages start with http://practice.cybertekschool.com "+driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com"));

        }
        driver.quit();





    }


}

