package adidas_project.page_objects;

import org.openqa.selenium.By;
import utilities.BrowserWait;
import utilities.Configuer;
import utilities.CustomeXpath;
import utilities.Driver;

public class SignUpPage {

    By sign_in_username = By.id("sign-username");
    By sign_up_password = By.id("sign-password");
    public void enterNewUserNameForSignUp(){
        Driver.getDriver().findElement(sign_in_username).sendKeys(Configuer.getProperty("username"));
    }
    public void enterNewUserPasswordForSignUp(){
        Driver.getDriver().findElement(sign_up_password).sendKeys(Configuer.getProperty("pswd"));
    }

    public void clickOnSigUpForNewUser(String tagname,String text){
        CustomeXpath.findWihttext(Driver.getDriver(),tagname,text).click();
        BrowserWait.sleep(2);
        Driver.getDriver().switchTo().alert().accept();
    }
}
