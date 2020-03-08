package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver CreateDriver(String browserName){

        if(browserName.equalsIgnoreCase("Chrome")){

            WebDriverManager.chromedriver().version("79.0").setup();
            return new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("Interner Explorer") ||(browserName.equalsIgnoreCase("IE") ) ){
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        }else if(browserName.equalsIgnoreCase("safari")){
            return new SafariDriver();
        }else {
            return null;
        }
    }


}
