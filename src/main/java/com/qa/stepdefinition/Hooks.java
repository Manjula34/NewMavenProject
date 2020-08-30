package com.qa.stepdefinition;

import cucumber.api.Scenario;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {
    protected WebDriver driver;
    public static Properties prop;
    public static final Logger logger = LogManager.getLogger(Hooks.class.getName());
    @Before
    public void Setup() throws IOException {
        System.out.println("In Before Class");
        FileInputStream file =  new FileInputStream("src/test/resources/configuration/config.properties");
        prop = new Properties();
        prop.load(file);
        String Browser = "chrome";
        System.out.println(Browser);

        try {
            if(Browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                logger.info("Firefox Browser is launched ");

            }else if(Browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                logger.info("Chrome Browser is launched ");
                System.out.println("chrome Browser launch");
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.get(prop.getProperty("url"));
            logger.info("url is entered in the browser");
        }catch (WebDriverException a) {
            System.out.println("Browser cannot be launched");

        }
    }
    @After
    public void TearDown(){
        driver.quit();

    }

}
