package com.qa.testrunner;
import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import org.testng.annotations.AfterClass;
@CucumberOptions
        (       features = "src\\test\\resources\\Features\\UK",
                glue = {"com.stepdefinition"},
                plugin = {"pretty", "html:src/test/resources/Reports/cucumber-html-report","json:src/test/resources/Reports/cucumber-html-report/jsonreport",
                        "com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/Reports/Extentreports/ExtentreportUK.html"},
                //tags= {"@tc_03_Registerpage"},
                strict = true,
                monochrome = true,
                dryRun = false
        )

public class TestRunnerUK extends AbstractTestNGCucumberTests{
    @AfterClass
    public static void extendReport()
    {
        Reporter.loadXMLConfig("extent-config.xml");
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
