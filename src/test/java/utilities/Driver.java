package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class Driver {

    private static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.setProperty("webdriver.driver.chromedriver","C:\\Users\\elgun\\IdeaProjects\\AllCucumberProjects\\chromedriver.exe");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver = null;
        }
    }
}
