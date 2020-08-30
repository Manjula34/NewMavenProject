package com.qa.testrunner;
import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import org.testng.annotations.AfterClass;
@CucumberOptions
        (

                features = "src/test/resources/Features/US",
                glue = {"com.qa.stepdefinition"},
                //plugin = {"pretty", "html:src/test/resources/Reports/cucumber-html-report","json:src/test/resources/Reports/cucumber-html-report/jsonreport",
                //        "com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/Reports/Extentreports/ExtentreportUS.html"},

                monochrome = true,
                dryRun = false
        )

public class TestRunnerUS extends AbstractTestNGCucumberTests{

}
