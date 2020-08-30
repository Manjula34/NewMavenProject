package com.qa.stepdefinition;

import com.qa.pagesUS.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginUS {
    WebDriver driver;
    LoginPage lp = new LoginPage(driver);
    @Given("Launch the browser and enter the url")
    public void launch_the_browser_and_enter_the_url() {
       System.out.println("In Loginmethod");
        lp.ClickonAccounts();
    }

    @When("Amazon page is opened")
    public void amazon_page_is_opened() {
    lp.signin();
    }

    @Then("Go to Accounts and lists and click  signin button")
    public void go_to_accounts_and_lists_and_click_signin_button() {
        lp.email();
    }

    @Then("login page is displayed")
    public void login_page_is_displayed() {
        String title = lp.getTitle();
        System.out.println(title);
       // Assert.assertEquals("Sign in", title);
    }

    @Then("enter the {string} and {string}")
    public void enter_the_and(String string, String string2) {

    }

    @Then("Click the login")
    public void click_the_login() {


    }

    @Then("Take screenshots and quit browser")
    public void take_screenshots_and_quit_browser() {

    }

}
