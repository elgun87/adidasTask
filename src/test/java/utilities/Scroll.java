package utilities;

import org.openqa.selenium.JavascriptExecutor;

public abstract class Scroll {
    public static void scrollDown(int byPixel){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("scrollBy(0,"+byPixel+")");
    }
}