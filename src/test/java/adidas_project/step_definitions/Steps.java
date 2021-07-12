package adidas_project.step_definitions;

import adidas_project.page_objects.DashboardPage;
import adidas_project.page_objects.LogInPage;
import adidas_project.page_objects.SignUpPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.mortbay.log.Log;
import utilities.BrowserWait;
import utilities.Configuer;
import utilities.CustomeXpath;
import utilities.Driver;


public class Steps {

    @Given("User Launch Chrome Browser")
    public void user_launch_chrome_browser() {
        Driver.getDriver();
    }

    @When("User opens url {string}")
    public void user_opens_url(String string) {
        Driver.getDriver().get(Configuer.getProperty("url"));
    }

    @When("User click on sign up")
    public void user_click_on_sign_up() {
        new DashboardPage().clickOnSignUp("a","Sign up");
    }

    @Then("User can view sign up pop up window")
    public void user_can_view_sign_up_pop_up_window() {
        BrowserWait.sleep(2);
        Assert.assertTrue(CustomeXpath.findWihttext(Driver.getDriver(),"h5","Sign up").isDisplayed());
    }

    @When("User enter new username")
    public void user_enter_new_username() {
        new SignUpPage().enterNewUserNameForSignUp();
    }

    @When("User enter new password")
    public void user_enter_new_password() {
        new SignUpPage().enterNewUserPasswordForSignUp();
    }

    @When("User click on Sign Up button")
    public void user_click_on_sign_up_button() {
        new SignUpPage().clickOnSigUpForNewUser("button","Sign up");
        BrowserWait.sleep(2);
    }

    @Then("User sign up pop window should be disappear")
    public void user_sign_up_pop_window_should_be_disappear() {
        Assert.assertFalse(CustomeXpath.findWihttext(Driver.getDriver(),"h5","Sign up").isDisplayed());
    }
    /*
    Log in Scenario
     */
    @When("User click on log in")
    public void user_click_on_log_in() {
        new LogInPage().clickOnLoginBtn("a","Log in");
    }

    @Then("User can view log in pop up window")
    public void user_can_view_log_in_pop_up_window() {
        BrowserWait.sleep(2);
        Assert.assertTrue(CustomeXpath.findWihttext(Driver.getDriver(),"h5","Log in").isDisplayed());
    }

    @When("User enter username")
    public void user_enter_username() {
        new LogInPage().enter_user_name_for_log_in();
    }

    @When("User enter password")
    public void user_enter_password() {
        new LogInPage().enter_password_for_log_in();
    }

    @When("User click on Log in button")
    public void user_click_on_log_in_button() {
        CustomeXpath.findWihttext(Driver.getDriver(),"button","Log in").click();
        BrowserWait.sleep(2);
    }

    @Then("User can view user dashboard")
    public void user_can_view_user_dashboard() {

    }
    /*
    Add to cart
     */
    @When("User navigates to Laptop")
    public void user_navigates_to_laptop() {
       new DashboardPage().clickOnLaptops();
    }

    @When("User clicks on {string}")
    public void user_clicks_on(String string) {
       new DashboardPage().selectItemFromMenu(string);
    }

    @When("click on add to cart and accept pop up confirmation")
    public void click_on_add_to_cart_and_accept_pop_up_confirmation() {
        new DashboardPage().addToCartBtn();
    }

    @When("User navigates back to home page")
    public void user_navigates_back_to_home_page() {
        new DashboardPage().navigate_home_page();
    }


    @When("User navigates to cart")
    public void user_navigates_to_cart() {
        new DashboardPage().clickOnCart();
    }


    @When("User deletes {string} from cart")
    public void user_deletes_from_cart(String item) {
        new DashboardPage().deleteItemFromCart(item);
    }

    @And("User click on place order")
    public void user_click_on_place_order() {
        new DashboardPage().clickOnPlaceOrderBtn();
    }

    @Then("User can view pop up web form window")
    public void user_can_view_pop_up_web_form_window() {
        new DashboardPage().confirmPopWindowDisplayed();
    }

    @When("User fill in web form fields")
    public void user_fill_in_web_form_fields() {
        new DashboardPage().fillInWebForm();
    }

    @When("User click on purchase")
    public void user_click_on_purchase() {
        new DashboardPage().clickOnPurchaseBtn();
    }

    @Then("User can verify amount equals expected")
    public void user_can_verify_amount_equals_expected() {

    }

    @Then("close browser")
    public void close_browser() {
        new DashboardPage().closeApplication();
    }

}
