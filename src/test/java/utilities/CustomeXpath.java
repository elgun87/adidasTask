package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class CustomeXpath {
    public static WebElement findWihttext(WebDriver driver, String tagname,String text){
        String locator = "//"+tagname+"[contains(text(),\"" +text+"\")]";
        return driver.findElement(By.xpath(locator));
    }
}
//[conta