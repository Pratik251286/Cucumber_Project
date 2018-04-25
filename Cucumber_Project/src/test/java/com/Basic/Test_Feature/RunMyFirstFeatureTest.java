package com.Basic.Test_Feature;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun = false,
		features={"src/test/resources/com/Basic/Test_FeatureFF/"},
		glue={"com/Basic/Test_Feature/"},
		
		plugin = {"pretty","html:target/cucumber-htmlreport",
				"json:target/cucumber-reort.json",
		}
				
		
		)
public class RunMyFirstFeatureTest {

	
}
