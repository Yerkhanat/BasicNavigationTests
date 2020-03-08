package utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com",
                "https://westelm.com/");

        //WebDriver driver1 = DriverFactory.CreateDriver("chrome");

        for (int i = 0; i <urls.size() ; i++) {
            WebDriver driver = BrowserFactory.CreateDriver("chrome");

            driver.get(urls.get(i));
            String url = driver.getCurrentUrl();
            String title = driver.getTitle();
            if(url.contains(title.toLowerCase().replace(" ", ""))){
                System.out.println("Test passed");
            }else {
                System.out.println("Test Failed");
            }

        driver.quit();
            BrowserUtils.wait(3);
        }
        BrowserUtils.wait(2);

    }

}
