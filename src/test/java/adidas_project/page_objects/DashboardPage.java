package adidas_project.page_objects;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserWait;
import utilities.CustomeXpath;
import utilities.Driver;

import java.util.List;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Laptops")
    WebElement laptops_menu;

    By all_items_in_laptops_menu = By.cssSelector("div#tbodyid div.card-block a");

    @FindBy(xpath = "//*[contains(text(),'Add to cart')]")
    WebElement add_to_cart_btn;

    @FindBy(css = "a#nava")
    WebElement product_store_logo;

    @FindBy(xpath = "//*[contains(text(),'Cart')]")
    WebElement cart;

    @FindBy(css = "tbody#tbodyid tr td")
    List<WebElement> cart_items;

    @FindBy(xpath = "//*[contains(text(),'Place Order')]")
    WebElement place_order_btn;

    @FindBy(css = "h5#orderModalLabel")
    WebElement placeOrderPopUpWindow;

    @FindBy(id = "name")
    WebElement name_input;

    @FindBy(id = "country")
    WebElement country_input;

    @FindBy(id = "city")
    WebElement city_input;

    @FindBy(id = "card")
    WebElement card_input;

    @FindBy(id = "month")
    WebElement month_input;

    @FindBy(id = "year")
    WebElement year_input;


    /*
    Sign Up Locators
     */


    public void clickOnLaptops() {
        laptops_menu.click();
        BrowserWait.sleep(2);
    }

    public void selectItemFromMenu(String item) {
        List<WebElement> items = Driver.getDriver().findElements(all_items_in_laptops_menu);
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getText().contains(item)) {
                items.get(i).click();
                break;
            }
        }
    }

    public void addToCartBtn() {
        add_to_cart_btn.click();
        BrowserWait.sleep(2);
        Driver.getDriver().switchTo().alert().accept();
    }

    public void navigate_home_page() {
        product_store_logo.click();
    }

    public void clickOnCart() {
        cart.click();
    }

    public void deleteItemFromCart(String item) {
        for (int i = 0; i < cart_items.size(); i++) {
            if (cart_items.get(i).getText().contains(item)) {
                cart_items.get(cart_items.size() - 1).findElement(By.tagName("a")).click();
            }
        }
    }

    public void clickOnPlaceOrderBtn() {
        BrowserWait.sleep(2);
        place_order_btn.click();
    }

    public void confirmPopWindowDisplayed() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(placeOrderPopUpWindow));
        Assert.assertTrue(placeOrderPopUpWindow.isDisplayed());
    }

    public void fillInWebForm() {
        Faker faker = new Faker();
        name_input.sendKeys(faker.name().firstName());
        country_input.sendKeys(faker.country().name());
        city_input.sendKeys(faker.country().capital());
        card_input.sendKeys(faker.business().creditCardNumber());
        month_input.sendKeys("July");
        year_input.sendKeys("2021");
    }

    public void clickOnPurchaseBtn() {

    }

    public void clickOnSignUp(String tagname, String text) {
        CustomeXpath.findWihttext(Driver.getDriver(), tagname, text).click();
    }


    public void closeApplication() {
        Driver.closeDriver();

    }
}
