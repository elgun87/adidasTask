package adidas_project.page_objects;

import org.openqa.selenium.By;
import utilities.BrowserWait;
import utilities.Configuer;
import utilities.CustomeXpath;
import utilities.Driver;

public class LogInPage {
    By loginusername = By.id("loginusername");
    By loginpassword = By.id("loginpassword");

    public void clickOnLoginBtn(String tagname,String text){
        CustomeXpath.findWihttext(Driver.getDriver(),tagname,text).click();
    }

    public void enter_user_name_for_log_in(){
        Driver.getDriver().findElement(loginusername).sendKeys(Configuer.getProperty("username"));
    }
    public void enter_password_for_log_in(){
        Driver.getDriver().findElement(loginpassword).sendKeys(Configuer.getProperty("pswd"));

    }
}
