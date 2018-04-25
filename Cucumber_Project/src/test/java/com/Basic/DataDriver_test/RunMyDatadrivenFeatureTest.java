package com.Basic.DataDriver_test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun = false,
		features={"src/test/resources/com/Basic/DataDriver_testFF/"},
		glue={"com/Basic/DataDriver_test/"},
		
		plugin = {"pretty","html:target/cucumber-htmlreport",
				"json:target/cucumber-reort.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html",
		}
				
		
		)
public class RunMyDatadrivenFeatureTest {

	
}
