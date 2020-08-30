package com.qa.pagesUS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver rdriver){
        this.driver=rdriver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//span[contains(text(),'Account & Lists')]")
    WebElement AccountList;
    @FindBy(xpath="//span[contains(text(),'Sign in') and contains(@class,'nav-action-inner')]")
    WebElement SigninBtn;
    @FindBy(id="ap_email")
    WebElement email;
    @FindBy(id="ap_password")
    WebElement pass;
    @FindBy(id="signInSubmit")
    WebElement submit;
    @FindBy(id="continue")
    WebElement cont;

    public void ClickonAccounts(){
        System.out.println("Clicking Accounts");
        AccountList.click();
    }
    public void signin(){
        SigninBtn.click();
    }
    public void email(){
        email.sendKeys("itsdinm@gmail.com");
        cont.click();
        pass.sendKeys("mmdindiv8285");
        submit.click();
    }
    public String getTitle(){
        return driver.getTitle();
    }
}
