package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		
        features="Features/Multi.feature",
		glue="com.steps",
		plugin={"pretty","html:target","com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html"}
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
